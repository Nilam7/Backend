package com.vinayak.Dao;

import java.util.List;

import com.vinayak.model.Category;

public interface CategoryDao  {

		public boolean addCategory(Category obj);
		public boolean deleteCategory(int id);
		/*public boolean getCategoryById(int id);
		public Category update(Category obj);*/
		public List<Category> getAllCategories();
}
