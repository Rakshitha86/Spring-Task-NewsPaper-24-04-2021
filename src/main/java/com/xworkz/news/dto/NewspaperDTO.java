package com.xworkz.news.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
public class NewspaperDTO implements Serializable{

	private int id;
	private String name;
	private double cost;
	private int noOfPages;
	private String language;
	private boolean magazine;

	public NewspaperDTO() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public NewspaperDTO(int id, String name, double cost, int noOfPages, String language, boolean magazine) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.language = language;
		this.magazine = magazine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isMagazine() {
		return magazine;
	}

	public void setMagazine(boolean magazine) {
		this.magazine = magazine;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [id=" + id + ", name=" + name + ", cost=" + cost + ", noOfPages=" + noOfPages
				+ ", language=" + language + ", magazine=" + magazine + "]";
	}
	

}
