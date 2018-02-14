package org.saqib.hibernate.CourseDetails;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Embeddable
public class EnrollmentId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumn(name="studentId")
	private StudentDetails studentDetails;
	
	
	@OneToOne
	@JoinColumns({@JoinColumn(name="courseid",referencedColumnName="courseid"),
		@JoinColumn(name="term",referencedColumnName="term"),
		@JoinColumn(name="section",referencedColumnName="section")
	})
	private ClassDetails classDetails;
	public EnrollmentId(StudentDetails studentDetails,  ClassDetails classDetails) {
		super();
		this.studentDetails = studentDetails;
		this.classDetails = classDetails;
	}
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	
	
	
	public ClassDetails getClassDetails() {
		return classDetails;
	}
	
	
}
