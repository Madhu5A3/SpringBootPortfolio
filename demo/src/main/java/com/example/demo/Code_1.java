package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Code_1 {
	private int codes_written;
	private String expert_language;
	public int getCodes_written() {
		return codes_written;
	}
	public void setCodes_written(int codes_written) {
		this.codes_written = codes_written;
	}
	public String getExpert_language() {
		return expert_language;
	}
	public void setExpert_language(String expert_language) {
		this.expert_language = expert_language;
	}
	
	public void show() {
		System.out.println("Code examples created");
	}
}
