package com.xworkz.news.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Entity
@Table(name = "newspaper_details")
public class NewspaperEntity implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COST")
	private double cost;

	@Column(name = "NOOFPAGES")
	private int noOfPages;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "MAGAZINE")
	private boolean magazine;

	public NewspaperEntity() {
		super();
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public NewspaperEntity(int id, String name, double cost, int noOfPages, String language, boolean magazine) {
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
