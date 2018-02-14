package org.saqib.hibernate.CourseDetails;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Enrollment {
	@EmbeddedId
	private EnrollmentId enrollmentId;

	public EnrollmentId getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(EnrollmentId enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	
	

}
