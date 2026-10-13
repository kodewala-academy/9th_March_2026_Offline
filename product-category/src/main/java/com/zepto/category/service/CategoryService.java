package com.zepto.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.category.entity.CategoryEntity;
import com.zepto.category.repository.CategoryRepository;
import com.zepto.category.request.response.CategoryRequest;
import com.zepto.category.request.response.CategoryResponse;
import com.zepto.product.entity.ProductEntity;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	// total 4 queries. --> N categories --> N+1
	public void showAllCategories() {
		System.out.println("CategoryService.showAllCategories() ::::::::::::::::: START :");
		// This fired one query to get all the categories
		// Iterable<CategoryEntity> categoryies = categoryRepository.findAll();

		List<CategoryEntity> categoryies = categoryRepository.getAllCategories();

		for (CategoryEntity categoryEntity : categoryies) {
			System.out.println(categoryEntity.getName());
			System.out.println(categoryEntity.getId());
			// one query per category(Here total 3 queries )
			List<ProductEntity> products = categoryEntity.getProducts(); // pls get the child as well

			System.out.println(" Total products are : " + products.size());
		}
		System.out.println("CategoryService.showAllCategories() ::::::::::::::::: END :");
	}

	public CategoryResponse createCategory(CategoryRequest categoryRequest) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDescription());
		categoryEntity.setStatus("Active");
		CategoryEntity responseEntiry = categoryRepository.save(categoryEntity);

		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.setId(responseEntiry.getId());
		categoryResponse.setName(responseEntiry.getName());
		categoryResponse.setDescription(responseEntiry.getDescription());
		categoryResponse.setStatus(responseEntiry.getStatus());

		return categoryResponse;
	}

	public CategoryResponse getCategoryById(Long id) {

		CategoryEntity categoryEntity = categoryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found with id: " + id));

		CategoryResponse response = new CategoryResponse();
		response.setId(categoryEntity.getId());
		response.setName(categoryEntity.getName());
		response.setDescription(categoryEntity.getDescription());
		response.setStatus(categoryEntity.getStatus());

		return response;
	}

}
