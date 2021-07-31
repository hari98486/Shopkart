package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Products;
import Model.SignUps;
import Repo.ProductsRepo;
import Repo.SignupRepo;

@RestController
@RequestMapping("/MyUser")
public class MyUserAction {
	
	@Autowired
	SignupRepo signuprepo;
	
	@PostMapping("/operations")
	public SignUps addreport(@Validated  @RequestBody SignUps signup)
	{
		return signuprepo.save(signup);
	}
	
	@Autowired
	ProductsRepo productsrepo;
	
	@GetMapping("/operations/{product_id}")
	public Optional<Products> getreport1(@PathVariable Integer product_id)
	{
		return productsrepo.findById(product_id);
	}
	
	@GetMapping("/operations")
	public List<Products> getproducts()
	{
		return productsrepo.findAll();
	}
}