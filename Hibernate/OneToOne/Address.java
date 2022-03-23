package JDBCmaven.onetoone;
import javax.persistence.*;

@Table(name="address")
@Entity

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int aid;
	private String house,city,state,country;
	private int pincode;
	
	@OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	private Employee employee;

	public int getAid() {
		return aid;
	}



	public void setAid(int aid) {
		this.aid = aid;
	}



	public String getHouse() {
		return house;
	}



	public void setHouse(String house) {
		this.house = house;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
