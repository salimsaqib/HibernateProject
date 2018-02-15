package org.saqib.hibernate.CourseDetails.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.saqib.hibernate.CourseDetails.ClassDetails;
import org.saqib.hibernate.CourseDetails.ClassDetailsId;
import org.saqib.hibernate.CourseDetails.ClassSchedule;
import org.saqib.hibernate.CourseDetails.ClassScheduleId;
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
		
		
		
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String studentid = "1";
		String term = "Spring";
		String courseid = "2";
		String section = "A";
		
		Query query = session.createQuery("from GradeDetails where studentid = ? and term = ? and section = ? and courseid = ?");
		query.setParameter(0, Integer.parseInt(studentid));
		query.setParameter(1, term);
		query.setParameter(2, section);
		query.setParameter(3, Integer.parseInt(courseid));
		
		List<GradeDetails> outputlist = (List<GradeDetails>) ((org.hibernate.query.Query) query).list();
		
		
		
		//session.save(classSchedule);
		session.getTransaction().commit();
		for(GradeDetails g: outputlist)
		{
			System.out.println(g.getGrade());
		}
		//System.out.println(studentlist.size());
		
		
	}
	
}
