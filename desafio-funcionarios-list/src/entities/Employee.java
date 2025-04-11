package entities;


public class Employee {
	// Classe com os atributos
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		// Construtor com os atributos
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// GetSet's
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// Logica para aumento de salario
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	// Mostrando mais bonitinho os funcionarios
	public String toString() {
		return id + " -- " + name + " -- " + String.format("%.2f", salary);
	}

}
