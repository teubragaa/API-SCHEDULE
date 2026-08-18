package com.example.schedule.repository;

import com.example.schedule.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository  extends JpaRepository<Classroom, Long> {
}
