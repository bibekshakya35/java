package org.eurokids.model;

public class Page {
	private int id;
	private String title;
	private String date;
	private String description;
	private String detail;
	private String Category;
	private int status;
	private String image;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Page(int id, String title, String date, String description, String detail, String category, int status,
		String image) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.description = description;
		this.detail = detail;
		Category = category;
		this.status = status;
		this.image = image;
	}
	public Page(String title, String date, String description, String detail, String category, int status,
			String image) {
		super();
		this.title = title;
		this.date = date;
		this.description = description;
		this.detail = detail;
		Category = category;
		this.status = status;
		this.image = image;
	}
	public Page() {
		super();
	}
	
	
}
