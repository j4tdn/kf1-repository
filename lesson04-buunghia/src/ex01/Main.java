package ex01;
import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Student sv1= new Student("Nghia",1,8.5f,9f);
		Student sv2= new Student ("An",2,6.5f,8f);
		Student sv3 = new Student();
		sv3.setName("Phu");
		sv3.setCode(3);
		sv3.setLt(7f);
		sv3.setTh(5f);
		students.add(sv1);
		students.add(sv2);
		students.add(sv3);
		printList(searchStudentByAvg(students, 8.5f));
		printList(searchStudentByPoint(students));
	}
	private static void printList(List<Student> studentList) {
		System.out.println(String.format("%-10s%-10s%-10s%-10s","Name","Code","LT","TH"));
		for (Student student:studentList) {
			System.out.println(student.toString());
		}
	}
	private static List<Student> searchStudentByAvg(List<Student> studentList,float avg){
		List<Student> list = new ArrayList<>();
		for (Student student:studentList) {
			if(student.getAvg()>=avg) list.add(student);
		}
		return list;
	}
	private static List<Student> searchStudentByPoint(List<Student> studentList){
		List<Student> list = new ArrayList<>();
		for (Student student:studentList) {
			if (student.getLt()>student.getTh()) list.add(student);
		}
		return list;
	}
}
