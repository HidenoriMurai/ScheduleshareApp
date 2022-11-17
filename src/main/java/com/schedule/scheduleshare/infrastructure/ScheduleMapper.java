package com.schedule.scheduleshare.infrastructure;

import com.schedule.scheduleshare.domain.entity.Schedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ScheduleMapper {

    @Select("SELECT * FROM schedule WHERE id=#{id}")
    Optional<Schedule> findScheduleId(int id);

    @Select("SELECT * FROM schedule")
    List<Schedule> findAll();


}
