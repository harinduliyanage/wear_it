/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.wearit.service.custom.impl;

import com.ijse.wearit.dao.custom.CategoryDAO;
import com.ijse.wearit.dao.custom.ItemDAO;
import com.ijse.wearit.dao.custom.ItemDetailsDAO;
import com.ijse.wearit.dto.ItemDTO;
import com.ijse.wearit.model.Category;
import com.ijse.wearit.model.Item;
import com.ijse.wearit.model.ItemDetails;
import com.ijse.wearit.service.custom.ItemService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


@Service
@Transactional
public class ItemServiceImpl  implements ItemService{
    
    @Autowired
    private ItemDAO itemDAOImpl;
    
    @Autowired
    private ItemDetailsDAO itemDetailsDAOImpl;
    
    @Autowired
    private CategoryDAO categoryDAOImpl;
    
    @Autowired
    ServletContext context;
    
    
    @Override
    public boolean add(Item t) throws Exception {
        return itemDAOImpl.add(t);
    }

    @Override
    public boolean update(Item t) throws Exception {
        return itemDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
       return itemDAOImpl.delete(id);
    }

    @Override
    public Item search(Integer id) throws Exception {
        return itemDAOImpl.search(id);
    }

    @Override
    public List<Item> getAll() throws Exception {
        return itemDAOImpl.getAll();
    }

    @Override
    public Item getItemByDescription(String description) throws Exception {
        return itemDAOImpl.getItemByDescription(description);
    }

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception {
        boolean result = false;
        MultipartFile file = itemDTO.getFile();
        String staticPath="resources/images/Item/tempFile/";
        String savedPath=staticPath+itemDTO.getFileName();
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    String path = context.getRealPath("/resources/images/Item") + File.separator +
                        "tempFile";
                    File dir = new File(path);
                    if (!dir.exists()){
			dir.mkdirs();
                    }
                    File destinationFile = new File(dir.getAbsolutePath()+File.separator+itemDTO.getFileName());
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(destinationFile));
                    stream.write(bytes);
                    stream.close();
                    
                    Category category = categoryDAOImpl.getCategoryByName(itemDTO.getCategoryName());
                    
                    Item item = new Item();
                    item.setDescription(itemDTO.getDescription());
                    item.setPaths(savedPath); 
                    item.setCategory(category);
                    result = itemDAOImpl.add(item);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        return result; 
    }

    @Override
    public boolean deleteItemByDescription(String description) throws Exception {
        boolean result = false;
        Item searchedItem = itemDAOImpl.getItemByDescription(description);
        
        result = itemDAOImpl.delete(searchedItem.getItemCode());
        if(result){
            List<ItemDetails> itemDetailsList = itemDetailsDAOImpl.searchByItemID(searchedItem);
            if(itemDetailsList == null){
                System.out.println("Delete operation is success");
                return result;
            }else{
                for(ItemDetails itemDetails : itemDetailsList){
                    System.out.println(itemDetails.getId()+"   ***************************");
                    result = itemDetailsDAOImpl.delete(itemDetails.getId());
                }
                System.out.println("Delete operation is success");
                return  result;
            }
            
        }else{
            result = false;
            System.out.println("Delete operation is failed.");
        }
               
        return  result;
    }
    
    

}


/*
    
            try{
                //you should use transacton delete 
                //code here to search item by description
                //then get Item have any item details and delete itemDetails
                //then searchitem.getPath();
                
                



            }catch(Exception e){
                System.out.println(e);

            }
*/