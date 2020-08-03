package com.eu.demo.dao;

import com.eu.demo.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    public List<Student> getStudents();

    public void deleteStudentById(Integer id);

    public void updateStudent(Student student);

    public Student getStudentsById(Integer id);
}
