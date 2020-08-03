package com.eu.demo.service;

import com.eu.demo.dao.StudentMapper;
import com.eu.demo.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getStudents(){
        return studentMapper.getStudents();
    }

    public void deleteStudentById(Integer id){
        studentMapper.deleteStudentById(id);
    }

    public void updateStudent(Student student){
        studentMapper.updateStudent(student);
    }

    public Student getStudentsById(Integer id){
        Student student = studentMapper.getStudentsById(id);
        return student;
    }
}
