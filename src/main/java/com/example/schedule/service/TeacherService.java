package com.example.schedule.service;

import com.example.schedule.entity.Teacher;
import com.example.schedule.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }

    public Teacher create(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void delete(Long id) {
        TeacherRepository.deleteById(id);
    }
}