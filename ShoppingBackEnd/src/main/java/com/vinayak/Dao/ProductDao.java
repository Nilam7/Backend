package com.vinayak.Dao;


import java.util.List;

import com.vinayak.model.Product;

public interface ProductDao {
	public boolean addProduct(Product p);
	public boolean updateProduct(Product p);
	public boolean deleteProduct(int productId);
	public Product getProductById(int productId);
	public List<Product> getAllProducts();

}
