package singleinheritence_example;

public class Person {
	private int pid;
	private String name;
	private String city;
	
	
	
	
	
	public Person(int pid, String name, String city) {
		this.pid = pid;
		this.name = name;
		this.city = city;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	

}
