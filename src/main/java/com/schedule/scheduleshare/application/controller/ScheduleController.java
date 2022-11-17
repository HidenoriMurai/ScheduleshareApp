package com.schedule.scheduleshare.application.controller;

import com.schedule.scheduleshare.domain.entity.Schedule;
import com.schedule.scheduleshare.domain.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/schedule/{id}")
    public Schedule getScheduleOne(@PathVariable("id") int id) {
        return scheduleService.findScheduleId(id);
    }

    @GetMapping("/schedule")
    public String showList(Model model) {
        model.addAttribute("scheduleList", scheduleService.findAll());
        return "schedulelist";
    }
}
