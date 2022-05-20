package ex01.bean;

/**
 * Viết chương trình OOP quản lý sinh viên
 * + Nhập xuất thông tin 
 * + Tính điểm trung bình 
 */

public class StudentUtils {
	private StudentUtils() {
	}

	public static void Students(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void getAveragePointMoreThan85(Student[] students) {
		System.out.println("Student who has average point more than 8.5 is: ");
		for (Student student : students) {
			if (student.avePts() > 8.5) {
				System.out.println(student);
			}
		}
	}

	public static void theoPtsMoreThanPracPts(Student[] students) {
		System.out.println("Student who has theoPts more than PracPts is: ");
		for (Student student : students) {
			if (student.getTheoPts() > student.getPracPts()) {
				System.out.println(student);
			}
		}
	}

}
