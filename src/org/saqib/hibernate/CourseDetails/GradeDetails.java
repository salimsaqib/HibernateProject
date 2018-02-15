package org.saqib.hibernate.CourseDetails;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class GradeDetails {
	@EmbeddedId
	private GradeDetailsId gradeDetailsId;
	
	private double grade;

	public GradeDetailsId getGradeDetailsId() {
		return gradeDetailsId;
	}

	public void setGradeDetailsId(GradeDetailsId gradeDetailsId) {
		this.gradeDetailsId = gradeDetailsId;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
	
	
}
