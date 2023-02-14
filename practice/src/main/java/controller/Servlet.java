package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Student_dao;
import dto.Student;

public class Servlet extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=arg0.getParameter("std_name");
		String b=arg0.getParameter("std_email");
		int c=Integer.parseInt( arg0.getParameter("mob_no"));
		String d=arg0.getParameter("date");
		String f=arg0.getParameter("country");
		
		Student student=new Student();
		student.setStd_name(a);
		student.setStd_email(b);
		student.setMob_no(c);
        student.setDate(d);
		student.setCountry(f);
		
		Student_dao dao=new Student_dao();
		dao.insert(student);
		
	}
	

}
