package com.ecommerce.app.dao.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	//Coleccion de objetos que tiene dentro a los usuarios
	static HashMap<String,User> userDatabase = new HashMap<>();
	
	
	@Override
	public void saveUser(User user) {
		//añade un usuarios identificados con el nombre de usuario (key es el nombre de usuario)
		userDatabase.put(user.getName(), user);
		System.out.println(user.getName() + " details saved");
		
	}

	@Override
	public User authenticateUser(String name, String password) {
		User u = null;
		u = userDatabase.get(name); //regresa el usuario guardado en la coleccion con Key nombre
		if(u == null) //si name, no conside con un keyName el userDatabase.get() regrea un nulo
			return null;
		if (! u.getPassword().equals(password)) { //caso usuario con contrase�a inv�lida
			User dummy = new User(); //se crea un usuario auxiliar
			dummy.setName(name);     //con nombre en el formulario
			dummy.setPassword(null); //sin contraseña
			return dummy;	
			}	
		return u;
	}

}

