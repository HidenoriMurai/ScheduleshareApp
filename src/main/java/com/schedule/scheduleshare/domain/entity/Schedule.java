package com.schedule.scheduleshare.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Schedule {

    private int id;

    private Date register_date;

    private String title;

    private String location;

    private Date schedule_date;

    private String content;
}
