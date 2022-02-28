package com.ecommerce.app.dao;

import java.util.List;

import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;


public interface CartDao {

	public List<Product> getProducts();
	
	public void addProduct(Product product);
	
	public double getTotal();
	
	public void clearCart();
	
	//void saveCart(Cart cart);

}
