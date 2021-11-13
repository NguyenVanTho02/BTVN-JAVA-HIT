package Bai3;

public class SinhVien extends Nguoi {
	private String idStudent;
	private String major;
	private int year;
	
	public SinhVien() {
		
	};
	
	public String getIdStudent() {
		return idStudent;
	}
	
	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
