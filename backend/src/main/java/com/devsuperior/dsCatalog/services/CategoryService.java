package com.devsuperior.dsCatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsCatalog.dto.CategoryDTO;
import com.devsuperior.dsCatalog.entities.Category;
import com.devsuperior.dsCatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();	
		
		//1a opção usando função lambda
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
		//2a opção usando for
		//List<CategoryDTO> listDto = new ArrayList<>();
		//for (Category cat : list) {
		//	listDto.add( new CategoryDTO(cat));
		//}
		//return listDto;
	}
}
