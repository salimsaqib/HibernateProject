package org.saqib.hibernate.CourseDetails;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ClassDetails implements Serializable{
	
	@EmbeddedId
	@JoinColumn(name="courseId")
	private ClassDetailsId classDetailsid;
	@OneToOne
	@JoinColumn(name="instructorId")
	private InstructorDetails instructorDetails;
	private static final long serialVersionUID = 1L;
	
	
	public ClassDetailsId getClassDetailsid() {
		return classDetailsid;
	}
	public void setClassDetailsid(ClassDetailsId classDetailsid) {
		this.classDetailsid = classDetailsid;
	}
	public InstructorDetails getInstructorDetails() {
		return instructorDetails;
	}
	public void setInstructorDetails(InstructorDetails instructorDetails) {
		this.instructorDetails = instructorDetails;
	}
	
	
	
	
	
	

}
