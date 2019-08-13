package com.vinayak.Dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinayak.model.Product;



@Repository(value="productDao")
@Transactional
public class ProductDaoImplementation implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addProduct(Product p) {
		
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			session.save(p);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	

}