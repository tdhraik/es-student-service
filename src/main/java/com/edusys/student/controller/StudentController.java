package com.edusys.student.controller;

import com.edusys.student.controller.request.AddStudentReq;
import com.edusys.student.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class/{classId}/student")
@Api(value = "/class/{classId}/student", description = "Student registration", tags = "student-service")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ApiOperation(value = "Add student")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "BAD_REQUEST")
    })
    public void addStudent(@PathVariable Long classId,
                           @RequestBody AddStudentReq addStudentReq) {
        studentService.addStudent(classId, addStudentReq);
    }

    //TODO : Bulk uploads
}
