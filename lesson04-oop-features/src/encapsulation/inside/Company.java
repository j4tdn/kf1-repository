package encapsulation.inside;

public class Company {
	private String policy;
	
	public String name;
	
	int numberOfEmpls;
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.name);
		System.out.println(emp.salary);
		System.out.println(emp.skills);
		
	}

}
