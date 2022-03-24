package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.jmx.export.annotation.ManagedNotification;

@Data
public class Customer {

	private Integer id;
	private String name;
	private List<Ticket> tickets;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;

	private String gender;
	private List<History> histories;
}
