package org.saqib.hibernate.CourseDetails;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

@Embeddable
public class ClassScheduleId implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@OneToOne
	@JoinColumns({@JoinColumn(name="courseId",referencedColumnName="courseId"),
		@JoinColumn(name="term",referencedColumnName="term"),
		@JoinColumn(name="section",referencedColumnName="section")
	})
	private ClassDetails classDetails;
	private String day;
	private String time;
	
	public ClassScheduleId(ClassDetails classDetails, String day, String time) {
		super();
		this.classDetails = classDetails;
		this.day = day;
		this.time = time;
	}

	public ClassDetails getClassDetails() {
		return classDetails;
	}

	public String getDay() {
		return day;
	}

	public String getTime() {
		return time;
	}
	
	
	
	
	
	
	
	
}
