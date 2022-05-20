package ex04.bean;

import java.time.LocalDate;

/**
 * Viết chương trình quản lý nhân sự tại công ty A
 * + Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ
 * + Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lg nhân viên quản lý
 * + Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị (phòng/ban)
 * Yêu cầu:
 * + Nhập dữ liệu gồm 1 GĐ, 1 TP, 2 NV
 * + Hiển thị thông tin các nhân sự 
 * + Tính và in ra mức lương cho từng loại nhân sự
 */

	

public abstract class Company {
	private String fullName;
	private LocalDate dateOfBirth;
	private double coefficientsSalary;

	public Company() {
	}

	public Company(String fullName, LocalDate dateOfBirth, double coefficientsSalary) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return "fullName=" + fullName + ", dayOfBirth=" + dateOfBirth.toString() + ", coefficientsSalary="
				+ coefficientsSalary;
	}

	public abstract double salary();

}
