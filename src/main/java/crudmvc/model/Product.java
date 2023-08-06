package crudmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prodId;
	@Column(length=1000)
	private String description;
	private long price;
	private String title;
	
	public Product() {
		super();
	}
	public Product(int prodId, String description, String title , long price) {
		super();
		this.prodId = prodId;
		this.description = description;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", description=" + description + ", price=" + price + ", title=" + title
				+ "]";
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}