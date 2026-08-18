package com.example.schedule.repository;

import com.example.schedule.entity.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinesRepository extends JpaRepository<Discipline, Long> {
}
