package com.zepto.category.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.category.request.response.CategoryRequest;
import com.zepto.category.request.response.CategoryResponse;
import com.zepto.category.service.CategoryService;

import brave.Tracer;

@RestController
@RequestMapping("category")
public class CategoryController {

	private static final Logger log = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	CategoryService categoryService;
	@Autowired
	private Tracer tracer;

	@PostMapping("/create")
	public ResponseEntity<CategoryResponse> createCategory(@RequestBody CategoryRequest categoryRequest) {
		CategoryResponse response = categoryService.createCategory(categoryRequest);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("showCategories")
	public String listAllCategories() {
		categoryService.showAllCategories();
		return "SUCCESS";
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoryResponse> getCategoryById(@PathVariable Long id) {

		log.info("Received request to fetch category with ID: " + id);

		// Inside getCategoryById()
		System.out.println("Current span: " + tracer.currentSpan());

		CategoryResponse response = categoryService.getCategoryById(id);

		log.info("Category fetched successfully. Name: " + response.getName());

		return ResponseEntity.ok(response);
	}
}
