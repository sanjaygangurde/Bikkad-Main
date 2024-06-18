package com.BikkadIT.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.model.Student;

public interface StudentServiceI {

	public Student saveStudentService(Student student);

	public List<Student> saveAllStudent(List<Student> student);

	public Student findOneStudent(int Sid);

	public List<Student> getAllStudent();

	public List<Student> findMultipleStudent(List<Integer> sids);

	public boolean recordExistsOrNot(int UserId);

	public long countNoOfRecordes();

	public boolean deleteRecordById(int UserId);

	public boolean deleteMultipleRecord(List<Integer> ids);

	public boolean deleteMultupleRecoreByObject(Student student);

	public boolean deleteAllRecords();
	
	public Page<Student> studentPagination();
	
	public List<Student> studentSorting();

}
