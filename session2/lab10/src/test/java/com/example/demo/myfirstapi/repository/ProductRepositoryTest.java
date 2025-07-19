package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository prodRepo;

    @BeforeEach
    void setup() {
        prodRepo = new ProductRepository();
    }

    @Test
    void testfindAllProductsWithExistingListOfProducts() {
        List<Product> initialProductsCopy = Collections.synchronizedList(new ArrayList<>());
        initialProductsCopy.add(new Product(3L, "Keyboard", 75.00));
        initialProductsCopy.add(new Product(1L, "Laptop", 1200.00));
        initialProductsCopy.add(new Product(2L, "Mouse", 25.50));

        assertTrue(prodRepo.findAll().containsAll(initialProductsCopy));
    }

    @Test
    void testFindExistingProductById() {
        Optional<Product> product = prodRepo.findById(1L);

        assertTrue(product.isPresent());
        assertEquals(1L, product.get().getId());
        assertEquals("Laptop", product.get().getName());
        assertEquals(1200.00, product.get().getPrice());
    }

    @Test
    void testFindNonExistingProductById() {
        Optional<Product> product = prodRepo.findById(9L);

        assertFalse(product.isPresent());
    }

    @Test
    void testSaveNewProductWithNoID() {
        Product newProduct = new Product("Ipad", 1600.99 );
        Product savedProduct = prodRepo.save(newProduct);
        Optional<Product> product = prodRepo.findById(savedProduct.getId());

        assertNotNull(savedProduct.getId());
        assertTrue(product.isPresent());
        assertEquals(savedProduct.getId(), product.get().getId());
        assertEquals("Ipad", product.get().getName());
        assertEquals(1600.99, product.get().getPrice());
    }

    @Test
    void testSaveExistingProductWithID() {
        Product existingProduct = new Product(3L,"Speaker", 150.45);
        Product updatedProduct = prodRepo.save(existingProduct);
        Optional<Product> product = prodRepo.findById(updatedProduct.getId());

        assertTrue(product.isPresent());
        assertEquals(3L, product.get().getId());
        assertEquals("Speaker", product.get().getName());
        assertEquals(150.45, product.get().getPrice());
    }

    @Test
    void testSaveExistingProductWithNonExistingID() {
        Product nonExistingProduct = new Product(100L,"Camera", 456);
        Product updatedProduct = prodRepo.save(nonExistingProduct);
        Optional<Product> product = prodRepo.findById(updatedProduct.getId());

        assertTrue(product.isEmpty());
        assertFalse(prodRepo.findAll().contains(nonExistingProduct));
    }
}