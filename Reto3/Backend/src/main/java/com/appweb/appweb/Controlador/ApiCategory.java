package com.appweb.appweb.Controlador;

import com.appweb.appweb.Entidad.Category;
import com.appweb.appweb.Servicio.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category/")
@CrossOrigin(origins = "*")
public class ApiCategory{

    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public List<Category> getCategories(){
        return service.getCategories();
    }

    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody Category category){
        service.saveCategory(category); // saveCategory(category)
        return ResponseEntity.status(201).build();
    }
}
