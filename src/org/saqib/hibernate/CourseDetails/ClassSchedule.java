package org.saqib.hibernate.CourseDetails;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ClassSchedule {
	@EmbeddedId
	private ClassScheduleId classScheduleId;
	private String room;
	
	
	public ClassScheduleId getClassScheduleId() {
		return classScheduleId;
	}
	public void setClassScheduleId(ClassScheduleId classScheduleId) {
		this.classScheduleId = classScheduleId;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	
}
