package Bai3;

import java.util.ArrayList;

public class LopHoc {
	private String idClass;
	private String nameClass;
	private String dayOpen;
	ArrayList<SinhVien> x = new ArrayList<>();
	private int n;
	private String teacher;
	
	public LopHoc() {
		
	}

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public String getDayOpen() {
		return dayOpen;
	}

	public void setDayOpen(String dayOpen) {
		this.dayOpen = dayOpen;
	}

	public ArrayList<SinhVien> getX() {
		return x;
	}

	public void setX (ArrayList<SinhVien> x) {
		this.x = x;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}	
}
