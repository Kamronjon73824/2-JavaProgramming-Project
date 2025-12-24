package com.vistula.project2.controller;
import com.vistula.project2.model.Product;
import com.vistula.project2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll() { return service.getAll(); }

    @PostMapping
    public Product create(@RequestBody Product p) { return service.save(p); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}