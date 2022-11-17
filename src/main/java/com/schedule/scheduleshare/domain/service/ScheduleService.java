package com.schedule.scheduleshare.domain.service;

import com.schedule.scheduleshare.domain.entity.Schedule;

import java.util.List;

public interface ScheduleService {

    Schedule findScheduleId(int id);

    List<Schedule> findAll();
}
