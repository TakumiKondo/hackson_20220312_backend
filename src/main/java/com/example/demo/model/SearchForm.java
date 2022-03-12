package com.example.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class SearchForm {
	//	検索リクエスト:/customers?name=AA&birthday_from=1995-07-02&birthday_to=1995-08-02&payment_code=[1,2,3,4] (GET)
	private String name;
	private String birthdayFrom;
	private String birthdayTo;
	private List<String> paimentCodes;
}
