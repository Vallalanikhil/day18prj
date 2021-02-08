package com.src;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainBindingXmlex {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setStudentid(21);
		s1.setStudentname("Roshan");
		s1.setStudentaddress("worldwide");
		Student s2=new Student();
		s2.setStudentid(51);
		s2.setStudentname("Manish");
		s2.setStudentaddress("Telangana");
		
		try {
			
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.marshal(s1, System.out);
		
		File file=new File("student.xml");
		marshaller.marshal(s2, file);
		System.out.println("inserted successfully");
	
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
