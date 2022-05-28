package encapsulation.outside;

import encapsulation.inside.Company;

public class ExternalCompany {
	public String name;
	private String policy;
	
	public static void main(String[] args) {
		Company c1 = new Company();
		System.out.println("c1#name: " + c1.name);
		
		// c1.numberOfEmpls; default
		// c1.policy; private
		
		ExternalEmployee extEmp = new ExternalEmployee();
		System.out.println(extEmp.name);
	}
}
