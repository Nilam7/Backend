package com.vinayak.Dao;

import java.util.List;

import com.vinayak.model.Category;

public interface CategoryDao  {

		public boolean addCategory(Category obj);
		public boolean deleteCategory(int id);
		public Category getCategoryById(int id);
		public boolean update(Category obj);
		public List<Category> getAllCategories();
}
