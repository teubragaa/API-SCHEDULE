package com.example.schedule.controller;

import com.example.schedule.entity.Teacher;
import com.example.schedule.service.TeacherService;
import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public Teacher create(RequestBody Teacher teacher){
        return teacherService.create(teacher);
    }
    @GetMapping
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }
}
