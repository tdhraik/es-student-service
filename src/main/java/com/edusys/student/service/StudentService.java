package com.edusys.student.service;

import com.edusys.student.controller.request.AddStudentReq;

public interface StudentService {
    void addStudent(Long classId, AddStudentReq addStudentReq);
}
