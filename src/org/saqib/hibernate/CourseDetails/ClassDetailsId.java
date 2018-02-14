package org.saqib.hibernate.CourseDetails;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class ClassDetailsId implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String term;
	private String section;
	@OneToOne
	@JoinColumn(name="courseid",referencedColumnName="courseId")
	private CourseDetails courseDetails;
	
	
	
	
	public ClassDetailsId(String term, String section, CourseDetails courseDetails) {
		super();
		this.term = term;
		this.section = section;
		this.courseDetails = courseDetails;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public CourseDetails getCourseDetails() {
		return courseDetails;
	}
	public void setCourseDetails(CourseDetails courseDetails) {
		this.courseDetails = courseDetails;
	}
	
	
	

}
