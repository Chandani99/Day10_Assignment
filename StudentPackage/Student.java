package StudentPackage;

public abstract class Student {
	String name; 
	String address; 
	
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}


	abstract double getPercentage( );


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
}
