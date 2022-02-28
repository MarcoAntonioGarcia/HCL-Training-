package com.ecommerce.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.app.dto.Credential;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	//Sort of welcome page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showRegistrationPage(Model model) {
		User user = new User();
		model.addAttribute("user", user); //Estamos pasando el usuario con el nombre identificativo "user" y así deberemos llamarlo en el JSP
		return "registration"; 	//This is a view		
	}
	
	
	//En este momento, el usuario ya tiene la informacion del formulario
	//ModelAtribute rescata la información que está en el model, enviada con el identificador "user" 
	//y lo guarda en un objeto de tipo User con un identificador que va delante como "user"	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute User user, Model model) {
		userService.saveUser(user);	   //Guarda el usuario en una coleccion de objetos usuario
		Credential credential = new Credential();    //crea un objeto de tipo credencial
		model.addAttribute("credential",credential); //Ese objeto credencial lo pasa al modelo
		return "login";   //This is a view
	}
	
	
	//Aqui seguimos teniendo el usuario y tambien tenemos los datos ingresados en el formulario
	//login que corresponden a la información de inicio de sesion.
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute Credential credential, Model model, RedirectAttributes ra) {
		User user  = userService.authenticateUser(credential.getName(), credential.getPassword());
		//System.out.println("User:   " + user);
		if(ObjectUtils.isEmpty(user))
			return "noregistration";
		if(user.getPassword() == null)
			return "loginfailure";
		System.out.println(user.getUserId());
		ra.addAttribute("userId", user.getUserId());
		return "redirect:/getProducts";
	}
	
	
	
}