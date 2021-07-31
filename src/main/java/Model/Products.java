package Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private Integer product_id;
	private String product_name;
	private String product_price;
	private String Quantity;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	
	public Products() {
		super();
	}
	public Products(int product_id, String product_name, String product_price, String quantity) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", Quantity=" + Quantity + "]";
	}
}
