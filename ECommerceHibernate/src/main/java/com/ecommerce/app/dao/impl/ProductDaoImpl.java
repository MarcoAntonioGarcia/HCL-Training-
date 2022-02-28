package com.ecommerce.app.dao.impl;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	List<Product> productsList = new ArrayList<>();
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {
		//initProductsList();
		//List<Product> productsList = new ArrayList<>(); //Lista de tipo productos donde se mostraran los productos que tiene la DB
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String Querry="FROM Product"; //"product" es el nombre de la clase entity
		List<Product>productsList =session.createQuery(Querry).getResultList(); 
		
		//for(Product p: productsList) {
		//	System.out.println("Estos deberian ser los productos "+p); //Para mostrar cada uno de los productos en la Tabla Products
		//}
		
		session.getTransaction().commit();
		session.close();
		
		//System.out.println("Products queried from database");
		return productsList;
	}

	@Override
	public void deleteProduct(Product p) {
		// TODO Auto-generated method stub
		for(Product pro : productsList) {
			if(pro.equals(p)) {
				if(pro.getProductQuantity() == 1)
					productsList.remove(pro);
				else
					pro.setProductQuantity(pro.getProductQuantity()-p.getProductQuantity());
			}
		}		
	}
	
	@Override
	public List<Product> getProductByName(String name) {
		//List<Product> products = new ArrayList<>();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String QuerryPFN="FROM Product WHERE productName= '"+name+"'";       //"product" es el nombre de la clase entity
		//u =(User) session.createQuery("FROM User WHERE name = '"+name+"'").uniqueResult();
		
		List<Product>productsList=session.createQuery(QuerryPFN).getResultList(); 
		System.out.println("ESTE ES El PRODUCTO "+ productsList);
		session.getTransaction().commit();
		session.close();
		
		
		/*
		for(Product p : productsList) 
			if(p.getProductName().equalsIgnoreCase(name))
				products.add(p);
		return products;
		*/
		return productsList;
		
	}
}