package com.example.schedule.controller;

import com.example.schedule.entity.Classroom;
import com.example.schedule.service.ClassroomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classroom")
public class ClassroomController {

    private final ClassroomService classroomService;

    public ClassroomController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @PostMapping
    public Classroom create(@RequestBody Classroom classroom) {
        return classroomService.create(classroom);
    }

    @GetMapping
    public List<Classroom> findAll() {
        return classroomService.findAll();
    }

    @GetMapping
    public Classroom finByUd(@PathVariable Long id){
        return classroomService.findById(id);
    }
}