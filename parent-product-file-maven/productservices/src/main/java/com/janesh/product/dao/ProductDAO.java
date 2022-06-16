package com.janesh.product.dao; //dao- Data Access Object

import com.janesh.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	
	Product read(int Id);
	
	void update(Product product);
	
	void delete(int Id);
}
