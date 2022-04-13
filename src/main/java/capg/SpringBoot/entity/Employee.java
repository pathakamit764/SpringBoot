package capg.SpringBoot.entity;

public class Employee {
     int id;
       String name;
       int salary;
       String address; 
       int dep_id;
	public Employee(int id, String name, int salary, String address, int dep_id) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.dep_id = dep_id;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDepId() {
		return dep_id;
	}
	public void setDepId(int depId) {
		this.dep_id = depId;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", depId="
				+ dep_id + "]";
	}
      
      
}