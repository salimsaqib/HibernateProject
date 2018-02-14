package org.saqib.hibernate.CourseDetails.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.saqib.hibernate.CourseDetails.ClassDetails;
import org.saqib.hibernate.CourseDetails.ClassDetailsId;
import org.saqib.hibernate.CourseDetails.CourseDetails;
import org.saqib.hibernate.CourseDetails.Enrollment;
import org.saqib.hibernate.CourseDetails.EnrollmentId;
import org.saqib.hibernate.CourseDetails.InstructorDetails;
import org.saqib.hibernate.CourseDetails.StudentDetails;

public class CourseDetailsMain {
	
	public static void main(String[] args)
	{
		CourseDetails courseDetails = new CourseDetails();
		Enrollment enrollment = new Enrollment();
		StudentDetails studentDetails = new StudentDetails();	
		ClassDetails classDetails = new ClassDetails();
		
		
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		courseDetails = session.get(CourseDetails.class, 2);
		studentDetails = session.get(StudentDetails.class,2);
		ClassDetailsId classDetailsId = new ClassDetailsId("Spring", "D", courseDetails);
		classDetails.setClassDetailsid(classDetailsId);
		classDetails = session.get(ClassDetails.class, classDetailsId);
		enrollment.setEnrollmentId(new EnrollmentId(studentDetails, classDetails));
		
		
		
		
		
		
		//session.save(enrollment);
		session.getTransaction().commit();
		System.out.println(classDetails.getInstructorDetails().getInstructorId());
		
		
	}
	
}
