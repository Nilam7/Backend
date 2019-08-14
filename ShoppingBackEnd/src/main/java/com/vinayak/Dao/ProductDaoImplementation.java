package com.vinayak.Dao;



import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vinayak.model.Category;
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
	public boolean updateProduct(Product p) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Product pr=session.get(Product.class,p.getProductId());
			pr.setPrice(p.getPrice());
			pr.setQuantity(p.getQuantity());
			pr.setProductName(p.getProductName());
			return true;
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean deleteProduct(int productId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Product p=session.get(Product.class,productId);
			p.setProductId(productId);
			session.delete(p);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public Product getProductById(int productId) {
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			Product cObj=session.get(Product.class,productId);
			return cObj;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	public List<Product> getAllProducts() {
		try {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from Product");
		return q.list();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return null;

	}
}