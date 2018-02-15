package org.saqib.hibernate.CourseDetails;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Embeddable
public class GradeDetailsId implements Serializable{

	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumns({@JoinColumn(name="studentId",referencedColumnName="studentId"),
		@JoinColumn(name="courseId",referencedColumnName="courseId"),
		@JoinColumn(name="term",referencedColumnName="term"),
		@JoinColumn(name="section",referencedColumnName="section")
	})
	private Enrollment enrollment;
	public GradeDetailsId() {}
	public GradeDetailsId(Enrollment enrollment) {
		super();
		this.enrollment = enrollment;
	}
	public Enrollment getEnrollment() {
		return enrollment;
	}
	
	
	
	
	
}
