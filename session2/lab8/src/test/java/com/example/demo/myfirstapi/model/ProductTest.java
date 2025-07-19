package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product product1, product2;

    @BeforeEach
    void setup() {
         product1= new Product(1L, "Ipad", 250.5);
         product2= new Product("Ball", 99.9);
    }

    @Test
    void testGetIdOfProductWithID() {
        assertEquals(1L, product1.getId());
    }

    @Test
    void testGetIdOfProductWithoutID() {
        assertNull(product2.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Ipad", product1.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(250.5, product1.getPrice());
    }

    @Test
    void testSetId() {
        Product sample = new Product(2L, "Iphone", 1000.3);
        sample.setId(5L);
        assertEquals(5L, sample.getId());
    }

    @Test
    void testSetName() {
        Product sample = new Product(3L, "Egg", 132);
        sample.setName("Apple");
        assertEquals("Apple", sample.getName());
    }

    @Test
    void testSetPrice() {
        Product sample = new Product(4L, "Water", 50.2);
        sample.setPrice(100);
        assertEquals(100, sample.getPrice());
    }

    @Test
    void testToStringofProductWithID() {
        assertEquals("Product{id=1, name='Ipad', price=250.5}", product1.toString());
    }

    @Test
    void testToStringofProductWithoutID() {
        assertEquals("Product{id=null, name='Ball', price=99.9}", product2.toString());
    }

    @Test
    void testEquals() {
        Product copy = new Product(1L, "Ipad", 250.5);
        assertTrue(copy.equals(product1));
    }

    @Test
    void testNotEquals() {
        Product fake = new Product(8L, "Ipad", 250.5);
        assertFalse(fake.equals(product1));
    }

    @Test
    void testHashCodeofBothProductsWithSameAttributeValue() {
        Product orig = new Product(1L, "Charger", 2501.5);
        Product copy = new Product(1L, "Charger", 2501.5);
        assertEquals(orig.hashCode(), copy.hashCode());
    }

    @Test
    void testHashCodeofBothProductsWithDifferentAttributeValue() {
        Product orig = new Product(1L, "Charger", 2501.5);
        Product copy = new Product(99L, "Charger", 252.5);
        assertNotEquals(orig.hashCode(), copy.hashCode());
    }
}