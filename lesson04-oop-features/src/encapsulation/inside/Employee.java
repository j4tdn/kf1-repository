package encapsulation.inside;

public class Employee extends EmpSkills {
	//public String name;
	//protected String skills;
	//private double salary;
	
	public static void main(String[] args) {
		Company c1 = new Company();
		System.out.println("c1#name: " + c1.name);
		
		System.out.println("amount: " + c1.numberOfEmpls);
		
		// c1.policy; private => X
	}

}
