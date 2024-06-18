package com.BikkadIT.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.model.Student;
import com.BikkadIT.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentService(Student student) {
		Student student1 = studentRepository.save(student);
		return student1;
	}

	@Override
	public List<Student> saveAllStudent(List<Student> student) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(student);
		return saveAll;
	}

	@Override
	public Student findOneStudent(int Sid) {
		Student findById = studentRepository.findById(Sid).get();

		return findById;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		return findAll;
	}

	@Override
	public List<Student> findMultipleStudent(List<Integer> sids) {
		List<Student> findAllById = (List<Student>) studentRepository.findAllById(sids);
		return findAllById;
	}

	@Override
	public boolean recordExistsOrNot(int UserId) {
		boolean existsById = studentRepository.existsById(UserId);
		return existsById;
	}

	@Override
	public long countNoOfRecordes() {
		long count = studentRepository.count();
		return count;
	}

	@Override
	public boolean deleteRecordById(int UserId) {

		boolean existsById = studentRepository.existsById(UserId);
		if (existsById) {
			studentRepository.deleteById(UserId);
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean deleteMultipleRecord(List<Integer> ids) {
		Iterable<Student> findAllById = studentRepository.findAllById(ids);
		if (findAllById != null) {
			studentRepository.deleteAllById(ids);
			return true;
		} else {
			return false;

		}
	}

	@Override
	public boolean deleteMultupleRecoreByObject(Student student) {
		boolean existsById = studentRepository.existsById(student.getSid());
		if (existsById) {
			studentRepository.delete(student);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteAllRecords() {
		Iterable<Student> findAll = studentRepository.findAll();
		if (findAll != null) {
			studentRepository.deleteAll();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Page<Student> studentPagination() {
		PageRequest of = PageRequest.of(0, 3);
		Page<Student> pages = studentRepository.findAll(of);
		return pages;
	}
	

	@Override
	public List<Student> studentSorting() {
		List<Student> findAll = studentRepository.findAll(Sort.by("saddress").ascending());
		return findAll;	
	
	}

	
}
