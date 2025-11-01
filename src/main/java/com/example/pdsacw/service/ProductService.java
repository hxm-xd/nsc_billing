package com.example.pdsacw.service;

import com.example.pdsacw.dto.ProductDTO;
import com.example.pdsacw.entity.Product;
import com.example.pdsacw.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public ProductDTO toDTO(Product product) {
      return new ProductDTO(
              product.getProductId(),
              product.getProductName(),
              product.getProductDescription(),
              product.getProductPrice(),
              product.getProductSellingPrice(),
              product.getProductQuantity()
              );
    }

    public Product toEntity(ProductDTO dto) {
        Product product = new Product();

        product.setProductId(dto.getProductId());
        product.setProductName(dto.getProductName());
        product.setProductDescription(dto.getProductDescription());
        product.setProductPrice(dto.getProductPrice());

        return product;
    }

}
