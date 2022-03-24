package com.example.demo.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class History {
	private Integer id;
	private Integer ticketId;
	private Integer customerId;
	private LocalDate useDate;
	private Integer storeId;
	private String storeName;
	private Integer staffId;
	private String staffName;
}
