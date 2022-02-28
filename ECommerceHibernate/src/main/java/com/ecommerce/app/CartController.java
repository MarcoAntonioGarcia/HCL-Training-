package com.ecommerce.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ecommerce.app.entity.Cart;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.CartService;

@Controller
public class CartController {
	@Autowired
	CartService cartService;
	
	//Showing cart
	@RequestMapping(value="/viewCart", method = RequestMethod.GET)
	public ModelAndView showCart(ModelAndView modelAndView, @RequestParam("userId") Integer userId) {
		List<Product> cartProducts = cartService.getProducts(); //Se va a la lista de productos que ya llenamos agregando cosas y la regresa con el carro
		modelAndView.addObject("cartProducts",cartProducts); //pasa el carro con los productos al modelo
		modelAndView.addObject("userId", userId); //pasa el user al modelo
		modelAndView.setViewName("cartview"); //Regresa la vista
		//System.out.println(userId);
		return modelAndView;		
	}
	
	//Return productsview
	@RequestMapping(value="/addToCart", method = RequestMethod.POST)
	public String addToCart(@ModelAttribute Product product, RedirectAttributes ra, @RequestParam("userId") Integer userId) {
		cartService.addProduct(product); //El carro recibe un submit del viewProducts y lo agrega a la lista carro
		System.out.println("adding product -CART CONTROLLER-");
		ra.addAttribute("userId", userId);
		return "redirect:/getProducts";
		//return "productsView";
		
	}
	
	@RequestMapping(value="/buyingCart", method = RequestMethod.POST)
	public String buyItems(ModelAndView modelAndView, @ModelAttribute Cart cart, RedirectAttributes ra) {
		System.out.println("buying items :)");  
		List<Product> cartProducts = cartService.getProducts(); //Obtenemso un carro de productos desde el car services con la lista de los seleccionados
		Cart current = new Cart(); 
		current.setUserId(cart.getUserId()); //pasamos userId al nuevo carro
		current.setProducts(cartProducts);   //Pasamos los productos que tiene el carro en el model al nuevo carro
		System.out.println(cartProducts);    
		ra.addFlashAttribute("cart", current); //Redireccionamos el nuevo carro como un objeto para hacer el historial de compra
		double total = cartService.getTotal(); //Otenemos el total con el metodo dentro de CartDaoImpl
		ra.addAttribute("total", total);       //Redireccionamos ese total a una vista que lo ocuparemos

		//System.out.println("LOLOLOLOO");
		
		return "redirect:/addingPurchase";
	}
	
	@RequestMapping(value = "/clearCart", method = RequestMethod.GET) 
	public String clearCart(@RequestParam("userId") Integer userId, RedirectAttributes ra) {
		cartService.clearCart();
		ra.addAttribute("userId", userId);
		return "redirect:/getProducts";
	}
	
}
