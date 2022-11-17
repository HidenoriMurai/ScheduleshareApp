package com.schedule.scheduleshare.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
public class Schedule {

    private int id;

    private String title;

    private String location;

    private Date scheduleDate;

    private String content;

    private Date registerDate;
}
