package crudmvc.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import crudmvc.model.Product;
import crudmvc.service.ProductService;

@Controller
public class MainController {
	@Autowired
	private ProductService productService;
	
	// home page  : 
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	// on clicking submit  : 
	@RequestMapping(value="/formSubmit" , method=RequestMethod.POST)
	public RedirectView formSubmit(@ModelAttribute Product prod , HttpServletRequest request) {
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath() + "/all-prods");
		this.productService.createProduct(prod);
		System.out.println(prod);
		return rv;
	}
	
	// all products show  : 
	@RequestMapping("/all-prods")
	public String allProds(Model model) {
		List<Product> allprods = this.productService.getAllProducts();
		model.addAttribute("allprods" , allprods);
		System.out.println(allprods);
		return "all_products";
	}
	
	// delete products : 
	@RequestMapping("/delete/{prodId}")
	public RedirectView deleteProd(@PathVariable("prodId") int prodId , HttpServletRequest request) {
		RedirectView rv = new RedirectView();
		rv.setUrl(request.getContextPath() + "/all-prods");
		this.productService.deleteProduct(prodId);
		return rv;
	}
	
	// edit product : 
	@RequestMapping("/edit/{prodId}")
	public String editProd(@PathVariable("prodId") int prodId , Model model) {
		Product prod = this.productService.getAProduct(prodId);
		model.addAttribute("prod", prod);
		return "edit_product";
	}
}
