package com.example.demo.Dto;

import java.time.LocalDateTime;

import com.example.demo.Entity.User;

import lombok.Data;
@Data
public class TimeWorkDto {
	private int id;
	private LocalDateTime time;
	private UserDoctorDto doctor;
	
}
