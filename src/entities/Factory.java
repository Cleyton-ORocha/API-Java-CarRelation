package entities;

public class Factory{
	
	private String name;
	private Address address;
	private StringBuilder assemblyLine;
	
	public Factory(String name, Address address, StringBuilder assemblyLine) {
		this.name = name;
		this.address = address;
		this.assemblyLine = assemblyLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StringBuilder getAssemblyLine() {
		return assemblyLine;
	}

	public void setAssemblyLine(StringBuilder assemblyLine) {
		this.assemblyLine = assemblyLine;
	}


	

}
