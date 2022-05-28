package encapsulation.outside;

import encapsulation.inside.EmpSkills;

public class ExternalEmployee extends EmpSkills{
	public static void main(String[] args) {
		ExternalEmployee extEmp = new ExternalEmployee();
		System.out.println(extEmp.skills);
	}
}
