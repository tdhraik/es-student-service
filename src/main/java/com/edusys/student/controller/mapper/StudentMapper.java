package com.edusys.student.controller.mapper;

import com.edusys.student.controller.request.AddStudentReq;
import com.edusys.student.domain.Student;

public class StudentMapper {

    public static Student mapToStudent(Long classId, AddStudentReq addStudentReq) {
        Student student = new Student();
        student.setClassId(classId);
        student.setFirstName(addStudentReq.getFirstName());
        student.setLastName(addStudentReq.getLastName());
        return student;
    }
}
