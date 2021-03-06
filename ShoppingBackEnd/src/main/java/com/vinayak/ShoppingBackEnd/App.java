package com.vinayak.ShoppingBackEnd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.vinayak.Dao.CategoryDao;
import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Category;
import com.vinayak.model.Product;

public class App 
{
    public static void main( String[] args )
    {
    
    	Product p=new Product();
    	p.setPrice(121);
    	p.setProductId(109);
    	p.setProductName("top");
    	p.setQuantity(1);
    	Category c=new Category();
    	
    	c.setCategoryName("Womens Wear");
    	c.setDescription("Formal and Casual Wear");
    	List<Product> l=new ArrayList<Product>();
    	l.add(p);
    	c.setProducts(l);
    	
    	
    	p.setCategory(c);
    	
    	
    	
   
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    			
        
       CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
        
        obj.addCategory(c);
       
        ProductDao obj1=context.getBean("productDao",ProductDao.class);
        
        obj1.addProduct(p);
        System.out.println("Category Added");
        
        List<Category> categories=obj.getAllCategories();
        for(Category cObj:categories) {
        	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName());
        }
        
        
    }
}
