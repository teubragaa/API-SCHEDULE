package com.example.schedule.controller;

public record ClassroomRequest(
        String daysOfWeek,
        String shift,
        String schedule,
        Long teacherId,
        Long disciplineId
) {
}
