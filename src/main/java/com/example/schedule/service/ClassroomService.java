package com.example.schedule.service;

import com.example.schedule.entity.Classroom;
import com.example.schedule.repository.ClassroomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    private final ClassroomRepository classroomRepository;

    public ClassroomService(ClassroomRepository classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public Classroom create(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }
}
