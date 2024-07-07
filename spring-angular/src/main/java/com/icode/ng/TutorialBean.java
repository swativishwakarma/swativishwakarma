package com.icode.ng;

public class TutorialBean {

	int id;
	String title;
	String description;
	boolean published;
	
	public TutorialBean() {
	}

	public TutorialBean(int id, String title, String description, boolean published) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}
	
	

	



}
