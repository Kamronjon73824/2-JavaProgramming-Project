package com.vistula.project2.service;
import com.vistula.project2.model.Product;
import com.vistula.project2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public List<Product> getAll() { return repository.findAll(); }
    public Product save(Product p) { return repository.save(p); }
    public void delete(Long id) { repository.deleteById(id); }
}