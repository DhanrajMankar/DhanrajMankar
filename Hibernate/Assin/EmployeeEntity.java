package JDBCmaven.Assin;

public class app3 {
	
	package hibernate.test.oneToMany.joinTable;
	 
	import java.io.Serializable;
	import java.util.Set;
	 
	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import javax.persistence.UniqueConstraint;
	 
	@Entity(name = "JoinTableEmployeeEntity")
	@Table(name = "Employee", uniqueConstraints = {
	@UniqueConstraint(columnNames = "ID"),
	@UniqueConstraint(columnNames = "EMAIL") })
	public class EmployeeEntity implements Serializable
	{
	  private static final long serialVersionUID = -1798070786993154676L;
	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "ID", unique = true, nullable = false)
	  private Integer employeeId;
	 
	  @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
	  private String email;
	 
	  @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
	  private String firstName;
	 
	  @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
	  private String lastName;
	 
	  @OneToMany(cascade=CascadeType.ALL)
	  @JoinTable(name="EMPLOYEE_ACCOUNT", joinColumns={@JoinColumn(name="EMPLOYEE_ID", referencedColumnName="ID")}
	  , inverseJoinColumns={@JoinColumn(name="ACCOUNT_ID", referencedColumnName="ID")})
	  private Set<AccountEntity> accounts;
	 
	  //Getters and setters
	}

}
