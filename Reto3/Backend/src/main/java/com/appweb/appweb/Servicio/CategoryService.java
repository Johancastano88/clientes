package com.appweb.appweb.Servicio;

import com.appweb.appweb.Entidad.Category;
import com.appweb.appweb.Repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService{

    @Autowired
    private CategoryRepository repository;

    // GET
    public List<Category> getCategories(){
        return repository.findAll();
    }

    // POST
    public Category saveCategory(Category category){
        return repository.save(category);
    }
}
