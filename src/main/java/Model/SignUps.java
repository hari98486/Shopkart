package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Entity
public class SignUps {
	@Id
	private Integer id;
	private String name;
	private String username;
	private String phonenumber;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public SignUps() {
		super();
	}
	public SignUps(int id, String name, String username, String phonenumber, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "SignUps [id=" + id + ", name=" + name + ", username=" + username + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}
	
	
	

}
