package com.janesh.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.janesh.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer,Product> products = new HashMap<>();
	@Override
	public void create(Product product) {
		products.put(product.getId(),product);
	}

	@Override
	public Product read(int Id) {
		
		return products.get(Id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int Id) {
		// TODO Auto-generated method stub

	}

}
