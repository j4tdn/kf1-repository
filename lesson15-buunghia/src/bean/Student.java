package bean;

import java.util.Objects;

public class Student {
	int id;
	String name;
	double averageScore;
	String gender;
	public Student() {}
	public Student(int id, String name, double averageScore, String gender) {
		this.id = id;
		this.name = name;
		this.averageScore = averageScore;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static Student transfer(String line) {
		String[] elements = line.split(",\s");
		if (elements.length != 4) {
			return null;
		}
		try {
			return new Student(
					Integer.parseInt(elements[0]),
					elements[1],
					Double.parseDouble(elements[2]),
					elements[3]
					);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		return this.getId() == student.getId();
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", averageScore=" + averageScore + ", gender=" + gender + "]";
	}
	
	
}
