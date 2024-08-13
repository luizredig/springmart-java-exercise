package springmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springmart.classes.Product;
import springmart.dto.product.ProductRequestDTO;
import springmart.dto.product.ProductResponseDTO;
import springmart.repositories.ProductRepository;

import java.util.stream.Stream;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public Stream<ProductResponseDTO> getAll() {
        return repository.findAll().stream().map(ProductResponseDTO::new);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void save(@RequestBody ProductRequestDTO data) {
        Product productData = new Product(data);
        repository.save(productData);
    }
}
