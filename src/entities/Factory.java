package entities;

public class Factory{
	
	private String name;
	
	public Factory(String name, StringBuilder assemblyLine) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
