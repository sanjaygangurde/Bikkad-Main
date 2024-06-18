package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.BikkadIT.Service.StudentServiceI;
import com.BikkadIT.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;

	public Student saveStudent(Student student) {

		studentServiceI.saveStudentService(student);
		return student;
	}

	public List<Student> saveAllStudent(List<Student> student) {
		List<Student> saveAllStudent = studentServiceI.saveAllStudent(student);
		return saveAllStudent;

	}

	public Student findOneStudent(int Sid) {
		Student findOneStudent = studentServiceI.findOneStudent(Sid);

		return findOneStudent;

	}

	public List<Student> getAllStudent() {
		List<Student> allStudent = studentServiceI.getAllStudent();
		return allStudent;

	}

	public List<Student> findMultipleStudent(List<Integer> sids) {
		List<Student> findMultipleStudent = studentServiceI.findMultipleStudent(sids);
		return findMultipleStudent;
	}

	public boolean recordExistsOrNot(int UserId) {
		boolean recordExistsOrNot = studentServiceI.recordExistsOrNot(UserId);

		return recordExistsOrNot;
	}

	public long countNoOfRecordes() {
		long countNoOfRecordes = studentServiceI.countNoOfRecordes();

		return countNoOfRecordes;

	}

	public boolean deleteRecordById(int UserId) {

		boolean deleteRecordById = studentServiceI.deleteRecordById(UserId);
		return deleteRecordById;

	}

	public boolean deleteMultipleRecord(List<Integer> ids) {
		boolean deleteMultipleRecord = studentServiceI.deleteMultipleRecord(ids);

		return deleteMultipleRecord;

	}

	public boolean deleteMultupleRecoreByObject(Student student) {
		boolean deleteMultuple = studentServiceI.deleteMultupleRecoreByObject(student);

		return deleteMultuple;
	}

	public boolean deleteAllRecords() {
		boolean deleteAllRecords = studentServiceI.deleteAllRecords();
		return deleteAllRecords;

	}

	public Page<Student> studentPagination() {
		Page<Student> studentPagination = studentServiceI.studentPagination();

		return studentPagination;

	}
	
	public List<Student> studentSorting(){
		List<Student> studentSorting = studentServiceI.studentSorting();
		
		return studentSorting;
		
		
	}
	

}
