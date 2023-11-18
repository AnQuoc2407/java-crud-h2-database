package com.bezkoder.spring.jpa.h2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "price")
  private String price;

  @Column(name = "salePrice")
  private String salePrice;

  @Column(name = "saleRate")
  private String saleRate;

  @Column(name = "type")
  private String type;

  @Column(name = "imageURL")
  private String imageURL;

  @Column(name = "published")
  private boolean published;

  public Tutorial() {

  }

  public String getSaleRate() {
    return saleRate;
  }

  public void setSaleRate(String saleRate) {
    this.saleRate = saleRate;
  }

  public Tutorial(String name, String price, String salePrice, String saleRate, String type, String imageURL, boolean published) {
    this.name = name;
    this.price = price;
    this.salePrice = salePrice;
    this.saleRate = saleRate;
    this.type = type;
    this.imageURL = imageURL;
    this.published = published;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price='" + price + '\'' +
            ", salePrice='" + salePrice + '\'' +
            ", saleRate='" + saleRate + '\'' +
            ", type='" + type + '\'' +
            ", imageURL='" + imageURL + '\'' +
            ", published=" + published +
            '}';
  }
}
