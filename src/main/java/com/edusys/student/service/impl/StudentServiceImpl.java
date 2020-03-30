package com.edusys.student.service.impl;

import com.edusys.student.adapter.repository.StudentRepository;
import com.edusys.student.controller.mapper.StudentMapper;
import com.edusys.student.controller.request.AddStudentReq;
import com.edusys.student.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Long classId, AddStudentReq addStudentReq) {
        studentRepository.save(StudentMapper.mapToStudent(classId, addStudentReq));
    }
}
