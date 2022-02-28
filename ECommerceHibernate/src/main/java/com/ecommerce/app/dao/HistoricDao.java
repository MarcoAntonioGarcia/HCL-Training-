package com.ecommerce.app.dao;

import java.util.List;



import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Purchase;

 

public interface HistoricDao {

 

    //public List<Purchase> getHistoric();
    public List<Cart> getHistoric();
    
    //public void addPurchase(Purchase purchase);
    public void addPurchase(Cart cart);
    
    //public List<Purchase> getHistoric(Integer userId);
    public List<Cart> getHistoric(Integer userId);
}
/*
public interface HistoricDao {

	public List<Purchase> getHistoric();
	public void addPurchase(Purchase purchase);
	public List<Purchase> getHistoric(Integer userId);
}
*/
