package com.ecommerce.app.dao.impl;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	//Coleccion de objetos que tiene dentro a los usuarios
	//static HashMap<String,User> userDatabase = new HashMap<>();
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User user) {
		//userDatabase.put(user.getName(), user); 
		Session session = sessionFactory.openSession(); //here we are opening the session
		session.beginTransaction(); //here start the transaction
		
		session.save(user); //here we save the transaction in the database
		
		session.getTransaction().commit();  //with this, we has a permanent transaction and this data is add at DB
		System.out.println("REGISTRO INCERTADO");
		//session.close(); //here we are closing the session
		
		System.out.println("Los datos del usuario "+ user.getName() + " Fueron guardados en la BD");
		
		
		session.beginTransaction();  //Iniciar nueva transaccion
		System.out.println("Lectura del registro de usuario con Id " + user.getUserId()); 
		User usuarioConsulta = session.get(User.class, user.getUserId());
		System.out.println("Registro de "+ usuarioConsulta);
	
		session.getTransaction().commit();
		session.close();
		
		
		
	}

	@Override
	public User authenticateUser(String name, String password) {
		User u = null;
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		u = (User) session.createQuery("FROM User WHERE name = '"+name+"'").uniqueResult(); //uniqueResult only return a value with the condition of querry and not return a list only with an element
		System.out.print("ESTEEEE ES EL VALOR DE U"+u);
		//session.getTransaction().commit();
		session.close();
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