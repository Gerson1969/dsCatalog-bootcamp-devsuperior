package com.devsuperior.dsCatalog.tests;

import java.time.Instant;

import com.devsuperior.dsCatalog.dto.ProductDTO;
import com.devsuperior.dsCatalog.entities.Category;
import com.devsuperior.dsCatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "GoodPhone", 800.0, "http://img.com/imp.png", Instant.parse("2021-06-18T18:36:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}

	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(1L,"Electronics");
	}
}
