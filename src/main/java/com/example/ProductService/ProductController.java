package com.example.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	@RequestMapping(path="/customer")
	public class ProductController {
		@GetMapping(path="/getAll")
		public String getCustomer() {
			return "Customer name fetched";
			
		
		}
		
		



}