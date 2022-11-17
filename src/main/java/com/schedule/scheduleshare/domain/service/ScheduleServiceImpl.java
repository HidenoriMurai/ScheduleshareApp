package com.schedule.scheduleshare.domain.service;

import com.schedule.scheduleshare.domain.entity.Schedule;
import com.schedule.scheduleshare.exception.ResourceNotFoundException;
import com.schedule.scheduleshare.infrastructure.ScheduleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleMapper scheduleMapper;

    @Override
    public Schedule findScheduleId(int id) {
        Optional<Schedule> schedule = scheduleMapper.findScheduleId(id);
        if (schedule.isPresent()) {
            return schedule.get();
        } else {
            throw new ResourceNotFoundException("resource not found");
        }
    }

    @Override
    public List<Schedule> findAll() {
        return scheduleMapper.findAll();
    }
}
