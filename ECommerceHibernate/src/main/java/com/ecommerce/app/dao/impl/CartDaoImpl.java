package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.CartDao;
import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;

@Repository
public class CartDaoImpl implements CartDao{

	@Autowired
	SessionFactory sessionFactory;
	List<Product> cart = new ArrayList<>();
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return cart;
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		if(exists(product)){		
			for(Product p : cart) {
				if(p.equals(product)) {
					p.setProductQuantity(p.getProductQuantity()+1);
					System.out.println(product + "added (+1) -CART DAO IMP-");
					return;
				}
			}
		} else {
			product.setProductQuantity(1);
			cart.add(product);
			System.out.println(product + "added (NEW) -CART DAO IMP-");
		}
		
	}
	
	private boolean exists(Product product) {
		for(Product p : cart) 
			if(p.equals(product))
				return true;
		return false;
	}

	
	@Override
	public double getTotal() {
		double total = 0;
		for(Product p : cart) 
			total += p.getPrice()*p.getProductQuantity(); 
		   System.out.println("total: " + total);
		return total;
	}
	
	public void clearCart() {
		cart.clear();
	}
	
	//@Override
	//public void saveCart(Cart cart) {
	//	System.out.println(cart.getId() + "Este es el ID del carro en el DAO");
		
	//}
	
}
