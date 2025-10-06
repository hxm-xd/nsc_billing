package com.example.pdsacw.controller;

import com.example.pdsacw.dto.ProductDTO;
import com.example.pdsacw.entity.Product;
import com.example.pdsacw.repository.ProductRepository;
import com.example.pdsacw.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @PostMapping
    public ProductDTO addProduct(@Valid @RequestBody ProductDTO productDTO) {
        Product product = productService.toEntity(productDTO);
        Product savedProduct = productRepository.save(product);

        return productService.toDTO(savedProduct);
    }

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productService::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable long id) {
        return productRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @Valid @RequestBody Product product) {
        Product savedProduct = productService.getProductById(id)
                .orElseThrow(() -> new RuntimeException("No Such product"));

        savedProduct.setProductName(product.getProductName());
        savedProduct.setProductDescription(product.getProductDescription());
        savedProduct.setProductPrice(product.getProductPrice());

        return productRepository.save(savedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }

}
