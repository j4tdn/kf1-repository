package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Student;


public class Ex05 {
	public static void main(String[] args) {
		File file = new File("student.txt");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Student> studentList = lines.stream()
										 .map(Student::transfer)
										 .collect(Collectors.toList());
		// 1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần
		// theo họ tên.	
		List<Student> ex01 = studentList.stream()
					.sorted(Comparator.comparing(Student::getAverageScore).thenComparing(Student::getName))
					.collect(Collectors.toList());
		System.out.println("Ex01:");
		ex01.forEach(System.out::println);
		// 2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
		List<Student> ex02 = studentList.stream()
				   .filter(s -> s.getAverageScore() > 8)
				   .collect(Collectors.toList());
		System.out.println("Ex02:");
		ex02.forEach(System.out::println);	
		// 3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
		List<Student> ex03 = studentList.stream()
				   .filter(s -> s.getGender().equalsIgnoreCase("Nu"))
				   .collect(Collectors.toList());
		System.out.println("Ex03:");
		ex03.forEach(System.out::println);
		// 4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
		//phân biệt với nhau thông qua MSSV
		List<Student> ex04 = studentList.stream()
				   .distinct()
				   .collect(Collectors.toList());
		System.out.println("Ex04:");
		ex04.forEach(System.out::println);
		
		
	}
	
}
