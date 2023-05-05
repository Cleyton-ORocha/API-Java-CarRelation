package entities;

public class Factory{
	
	private String name;
	private StringBuilder assemblyLine;
	
	public Factory(String name, StringBuilder assemblyLine) {
		this.name = name;
		this.assemblyLine = assemblyLine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StringBuilder getAssemblyLine() {
		return assemblyLine;
	}

	public void setAssemblyLine(StringBuilder assemblyLine) {
		this.assemblyLine = assemblyLine;
	}


	

}
