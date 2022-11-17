package com.schedule.scheduleshare.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Schedule {

    private int id;

    private String title;

    private Date scheduleDate;

    private String location;

    private String content;

    private Date registerDate;
}
