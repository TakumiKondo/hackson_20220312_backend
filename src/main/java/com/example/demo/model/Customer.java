package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Customer {
	private Integer id;
	private String name;
	private List<Ticket> tickets;
	private LocalDate birthday;
	private String gender;
	private List<History> histories;
}
