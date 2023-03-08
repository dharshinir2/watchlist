package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class model {
	@Id
	private int serialnumber;
	private String name;
	private String movieorseries;
	private String genre;
	private String Streamingsite;
	public model(int serialnumber, String name, String movieorseries, String genre, String streamingsite) {
		super();
		this.serialnumber = serialnumber;
		this.name = name;
		this.movieorseries = movieorseries;
		this.genre = genre;
		Streamingsite = streamingsite;
	}
	public model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieorseries() {
		return movieorseries;
	}
	public void setMovieorseries(String movieorseries) {
		this.movieorseries = movieorseries;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getStreamingsite() {
		return Streamingsite;
	}
	public void setStreamingsite(String streamingsite) {
		Streamingsite = streamingsite;
	}
	

}
