package com.janesh.product.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.janesh.product.dto.Product;

class ProductDAOImplTest {

	@Test
	void createShouldCreateAProduct() {
		ProductDAO dao= new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setPname("Hola");
		product.setDesp("WElcome Message");
		product.setPrice(20);
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("WElcome Message",result.getDesp());
	}

}
