package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.ProductService;

@Controller
public class ProductControler {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/getProducts", method= RequestMethod.GET)
	public ModelAndView getAllProducts(ModelAndView modelAndView,@RequestParam("userId") Integer userId) {
		List<Product> productsList = productService.getProductsList(); 
		modelAndView.addObject("productsList",productsList); //Pasa la lista de productos (llena) al controlador
		modelAndView.addObject("userId", userId); //Pasa al Modelo el parametro userId con el mismo identificador
		modelAndView.setViewName("productsview"); //Pasa la vista que devolverá el método
		return modelAndView;
	}
	
	
	
	//Con el @RequestParam estamos obtenidno lo que se tecleo en el formulario de busqueda y se guarda como String productName
	//Con el siguiente RequestParam, obtnego el userID como entero y lo gusrdo en userID
	@RequestMapping(value="/getProductByName", method= RequestMethod.GET)
	public ModelAndView getProductByName(ModelAndView modelAndView, @RequestParam("productName") String productName, 
			@RequestParam("userId") Integer userId)
	{
		List<Product> productsList = productService.getProductByName(productName); //Buscar por nombre
		System.out.println("ESTE ES LA BUSQUEDA "+ productsList);
		modelAndView.addObject("products",productsList); //Agrega al modelo la lista de productos creada al buscar
		modelAndView.addObject("userId", userId);        //Agrega el User ID
		modelAndView.setViewName("productbynameview");   //Agrega la vista
		return modelAndView;
	}	
}