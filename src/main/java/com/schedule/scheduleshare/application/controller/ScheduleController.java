package com.schedule.scheduleshare.application.controller;

import com.schedule.scheduleshare.domain.entity.Schedule;
import com.schedule.scheduleshare.domain.service.ScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/{id}")
    public Schedule getScheduleOne(@PathVariable("id") int id) {
        return scheduleService.findScheduleId(id);
    }
}
