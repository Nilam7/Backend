package com.vinayak.ShoppingBackEnd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
import com.vinayak.model.Product;

public class Productmain {

	public static void main(String[] args) {
		Category c=new Category();
		c.setCategoryName("Womens Wear");
    	c.setDescription("Formal and Casual Wear");
		Product p=new Product();
    	p.setPrice(121);
    	p.setProductId(109);
    	p.setProductName("top");
    	p.setQuantity(1);
  
    	p.setCategory(c);

    	
    	
   
    	ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\nilam.shaw\\Downloads\\SpringbackEndUpdated-master\\SpringbackEndUpdated-master\\ShoppingBackEnd\\src\\main\\java\\spring.xml");
    			
        
       CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
        
        obj.addCategory(c);
       
        ProductDao obj1=context.getBean("productDao",ProductDao.class);
        
        obj1.addProduct(p);
        System.out.println("Category Added");
        
        
    }

	}


