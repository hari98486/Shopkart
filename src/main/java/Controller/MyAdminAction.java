package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Model.Products;
import Model.SignUps;
import Repo.ProductsRepo;
import Repo.SignupRepo;

@RestController
@RequestMapping("/MyAdmin")
public class MyAdminAction {
	@Autowired
	ProductsRepo productsrepo;
	
	@PostMapping("/operations")
	public Products addreport(@Validated  @RequestBody Products products )
	{
		return productsrepo.save(products);
	}
	
	@GetMapping("/operations")
	public List<Products> getproducts()
	{
		return productsrepo.findAll();
	}
	
	@PutMapping("operations/{product_id}")
	public Products update(@PathVariable Integer product_id, @Validated @RequestBody Products product)
	{
		if(productsrepo.findById(product_id).isPresent())
		{
			return productsrepo.save(product);
		}
		return null;
	}
	
	@GetMapping("/operations/{product_id}")
	public Optional<Products> getreport1(@PathVariable Integer product_id)
	{
		return productsrepo.findById(product_id);
	}
	
	@DeleteMapping("/operations/{product_id}")
	public String delete(@PathVariable Integer product_id)
	{
		productsrepo.deleteById(product_id);
		return "Succesfully Deleted";
	}
	@Autowired
	SignupRepo signuprepo;
	
	@GetMapping("/getuser")
	public List<SignUps> getusers()
	{
		return signuprepo.findAll();
	}
	
	
	
	

}
