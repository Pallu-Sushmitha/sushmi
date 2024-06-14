package com.example.demo.model;


	

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;

	@Entity

	public class Assessment {

	 @Id

	 @GeneratedValue 

	 private int assessmentId;

	 private String assessmentName;
	 private int totalMarks;
	 private int passingMarks;
	 private String dateCreated;
	 private String dateScheduled;
	 private String duration;
	public int getAssessmentId() {
		return assessmentId;
	}
	public void setAssessmentId(int assessmentId) {
		this.assessmentId = assessmentId;
	}
	public String getAssessmentName() {
		return assessmentName;
	}
	public void setAssessmentName(String assessmentName) {
		this.assessmentName = assessmentName;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public int getPassingMarks() {
		return passingMarks;
	}
	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateScheduled() {
		return dateScheduled;
	}
	public void setDateScheduled(String dateScheduled) {
		this.dateScheduled = dateScheduled;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	 
	}
	 