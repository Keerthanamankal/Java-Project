package com.wiley.pojo;

public class Doctor {
	
	private int doctorid;
	private String name;
	private String specialization;
	private String location;
	private double doctorFees;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getDoctorFees() {
		return doctorFees;
	}
	public void setDoctorFees(double doctorFees) {
		this.doctorFees = doctorFees;
	}
	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", name=" + name + ", specialization=" + specialization + ", location="
				+ location + ", doctorFees=" + doctorFees + "]";
	}
	
	
}
