package Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Model.Products;

@Repository
@Component
public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
