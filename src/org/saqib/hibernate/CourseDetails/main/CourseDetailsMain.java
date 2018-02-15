package org.saqib.hibernate.CourseDetails.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.saqib.hibernate.CourseDetails.ClassDetails;
import org.saqib.hibernate.CourseDetails.ClassDetailsId;
import org.saqib.hibernate.CourseDetails.CourseDetails;
import org.saqib.hibernate.CourseDetails.Enrollment;
import org.saqib.hibernate.CourseDetails.EnrollmentId;
import org.saqib.hibernate.CourseDetails.GradeDetails;
import org.saqib.hibernate.CourseDetails.GradeDetailsId;
import org.saqib.hibernate.CourseDetails.InstructorDetails;
import org.saqib.hibernate.CourseDetails.StudentDetails;

public class CourseDetailsMain {
	
	public static void main(String[] args)
	{
		CourseDetails courseDetails = new CourseDetails();
		Enrollment enrollment = new Enrollment();
		StudentDetails studentDetails = new StudentDetails();	
		ClassDetails classDetails = new ClassDetails();
		GradeDetails gradeDetails = new GradeDetails();
		gradeDetails.setGrade(3.5);
		
		
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		courseDetails = session.get(CourseDetails.class, 2);
		studentDetails = session.get(StudentDetails.class,1);
		ClassDetailsId classDetailsId = new ClassDetailsId("Spring", "A", courseDetails);
		classDetails = session.get(ClassDetails.class, classDetailsId);
		EnrollmentId enrollmentId = new EnrollmentId(studentDetails, classDetails);
		enrollment = session.get(Enrollment.class, enrollmentId);
		GradeDetailsId gradeDetailsId = new GradeDetailsId(enrollment);
		gradeDetails.setGradeDetailsId(gradeDetailsId);
		
		
		
		session.save(gradeDetails);
		session.getTransaction().commit();
		//System.out.println(classDetails.getInstructorDetails().getInstructorId());
		
		
	}
	
}
