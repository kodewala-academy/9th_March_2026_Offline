
package com.zepto.invoice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zepto.invoice.category.client.CategoryClient;
import com.zepto.invoice.category.response.CategoryResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CategoryService {

    private static final Logger log =
            LoggerFactory.getLogger(CategoryService.class);

    private final CategoryClient categoryClient;

    public CategoryService(CategoryClient categoryClient) {
        this.categoryClient = categoryClient;
    }

    @CircuitBreaker(
        name = "categoryService",
        fallbackMethod = "fallbackCategoryService"
    )
    public CategoryResponse getCategory(Long id) {

        log.info("Calling Category Service for category ID: {}", id);

        return categoryClient.getCategoryById(id);
    }

    // Fallback method
    private CategoryResponse fallbackCategoryService(
            Long id, Throwable e) {

        log.error(
            "Circuit breaker fallback triggered for category ID: {}. Reason: {}",
            id, e.getMessage()
        );

        return null;
    }
}
