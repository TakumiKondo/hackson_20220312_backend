package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Ticket {
	private Integer id;
	private String paymentCode;
	private String paymentName;
	private Integer remaining;
	private LocalDate startDate;
	private LocalDate limitDate;
}
