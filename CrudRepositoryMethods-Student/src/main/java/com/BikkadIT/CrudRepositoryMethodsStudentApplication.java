package com.BikkadIT;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.controller.StudentController;
import com.BikkadIT.model.Student;

@SpringBootApplication
public class CrudRepositoryMethodsStudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodsStudentApplication.class, args);
		
		StudentController controller = context.getBean(StudentController.class);
//		
//		Student student11= new Student();
//		student11.setSname("sudarshan");
//		student11.setSaddress("pune");
//		student11.setSmarks(89);
//	
//		Student student22 = controller.saveStudent(student11);      // insert and update one record
//		System.out.println(student22);
		
//		Student student1= new Student();
//		student1.setSid(1);
//		student1.setSname("sanjay");
//		student1.setSaddress("tisgaon");
//		student1.setSmarks(78);
//		
//		Student student2= new Student();
//		student2.setSname("rutuja");
//		student2.setSaddress("dhule");           
//		student2.setSmarks(98);
//		
//		Student student3= new Student();
//		student3.setSname("sagar");
//		student3.setSaddress("niphad");
//		student3.setSmarks(85);
//		
//		Student student4= new Student();
//		student4.setSname("dipali");
//		student4.setSaddress("nashik");
//		student4.setSmarks(40);
//		
//		Student student5= new Student();
//		student5.setSname("savita");
//		student5.setSaddress("ozar");
//		student5.setSmarks(56);
//		
//		Student student6= new Student();
//		student6.setSname("anil");
//		student6.setSaddress("nashik");
//		student6.setSmarks(40);
//		
//		
//		
//		List<Student> al= new ArrayList<Student>();
//		al.add(student1);
//		al.add(student2);
//		al.add(student3);
//		al.add(student4);
//		al.add(student5);
//		al.add(student6);
//		
//		
//		List<Student> allStudent = controller.saveAllStudent(al);   // to insert mupltiple entries at a one time
//		System.out.println(allStudent);
		
		
		
		
//		Student findOneStudent = controller.findOneStudent(6);       // to find one entrie at a time
//		System.out.println(findOneStudent);
		
//		List<Student> getAllStudent = controller.getAllStudent();     // to get all student data
//		System.out.println(getAllStudent);
		
		
		
		
		
//		List<Integer> al= new ArrayList<>();
//		al.add(4);
//		al.add(2);
//        al.add(8);	
//        
//        List<Student> findMultipleStudent = controller.findMultipleStudent(al);
//        System.out.println(findMultipleStudent);
		
		
		
//		boolean recordExistsOrNot = controller.recordExistsOrNot(7);
//		System.out.println(recordExistsOrNot);
	
		
		
//		long countNoOfRecordes = controller.countNoOfRecordes();
//		System.out.println(countNoOfRecordes);
		
	
		
//		boolean deleteRecordById = controller.deleteRecordById(2);
//		System.out.println(deleteRecordById);
		
		
		
		
//		List<Integer> al= new ArrayList<>();
//		al.add(4);
//        al.add(8);
//        
//        boolean deleteMultipleRecord = controller.deleteMultipleRecord(al);
//        System.out.println(deleteMultipleRecord);
        
		
		
 
//		Student student= new Student();
//		student.setSid(6);
//		
//		boolean deleteMultupleRecoreByObject = controller.deleteMultupleRecoreByObject(student);
//		System.out.println(deleteMultupleRecoreByObject);
		
		
		
		
//		boolean deleteAllRecords = controller.deleteAllRecords();
//		System.out.println(deleteAllRecords);
        
        
		
//		Page<Student> page = controller.studentPagination();
//		System.out.println(page);
//		for(Student s: page) {
//			System.out.println(s);
//		}
		
		
		List<Student> studentSorting = controller.studentSorting();
		for (Student s: studentSorting)
		System.out.println(s);
		
		
	}

}
