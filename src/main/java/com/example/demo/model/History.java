package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class History {
	private Integer historyId;
	private LocalDate useDate;
	private Integer storeId;
	private Integer staffId;
}
