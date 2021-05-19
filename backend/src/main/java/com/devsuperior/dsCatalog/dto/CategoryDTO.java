package com.devsuperior.dsCatalog.dto;

import java.io.Serializable;

import com.devsuperior.dsCatalog.entities.Category;

public class CategoryDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String Name;
	
	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name) {
		this.id = id;
		Name = name;
	}

	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		Name = entity.getName();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	
}
