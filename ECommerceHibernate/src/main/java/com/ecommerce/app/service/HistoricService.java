package com.ecommerce.app.service;

import java.util.List;



import org.springframework.stereotype.Service;

 

import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Purchase;

 

@Service
public interface HistoricService {
    //public List<Purchase> getHistoric();
    public List<Cart> getHistoric();
    
    //public void addPurchase(Purchase purchase);
    public void addPurchase(Cart cart);
    
    //public List<Purchase> getHistoric(Integer userId);
    public List<Cart> getHistoric(Integer userId);
}


/*
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.app.entity.Purchase;

@Service
public interface HistoricService {
	public List<Purchase> getHistoric();
	public void addPurchase(Purchase purchase);
	public List<Purchase> getHistoric(Integer userId);
	
}
*/

