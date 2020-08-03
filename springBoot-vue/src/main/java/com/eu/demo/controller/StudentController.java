package com.eu.demo.controller;

import com.eu.demo.common.Result;
import com.eu.demo.common.StatusCode;
import com.eu.demo.pojo.Student;
import com.eu.demo.service.StudentService;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public Result getStudnets(){
        List<Student> students = studentService.getStudents();
        return new Result(true, StatusCode.OK,"获取数据成功",students);
    }

    @DeleteMapping("/delete")
    public Result deleteStudentById(@RequestParam("id") Integer id){
        studentService.deleteStudentById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    @PutMapping("/update/{id}")
    public Result updateStudent(@PathVariable Integer id,@RequestBody Student student){
        System.out.println(id);
        studentService.updateStudent(student);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    @GetMapping("/getStudentsById/{id}")
    public Result getStudentsById(@PathVariable Integer id){
        return new Result(true,StatusCode.OK,"查询成功",studentService.getStudentsById(id));
    }
}
