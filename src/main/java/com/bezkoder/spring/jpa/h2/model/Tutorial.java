package com.bezkoder.spring.jpa.h2.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

@Entity
@Table(name = "tutorials")
public class Tutorial {
  //  author, description, rate, like với content
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "author")
  private String author;

  @Column(name = "description")
  private String description;

  @Column(name = "rate")
  private String rate;

  @Column(name = "identifier")
  private String like;

  @Column(name = "content")
  private String content;



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

  @Column(name = "format")
  private String format;

  @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
  @Column(name = "publishedDate")
  private String publishedDate;

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }



  public Tutorial() {

  }



  public String getSaleRate() {
    return saleRate;
  }

  public void setSaleRate(String saleRate) {
    this.saleRate = saleRate;
  }


  public Tutorial(String name, String author, String description, String rate, String like, String content, String price, String salePrice, String saleRate, String type, String imageURL, boolean published, String format, String publishedDate) {
    this.name = name;
    this.author = author;
    this.description = description;
    this.rate = rate;
    this.like = like;
    this.content = content;
    this.price = price;
    this.salePrice = salePrice;
    this.saleRate = saleRate;
    this.type = type;
    this.imageURL = imageURL;
    this.published = published;
    this.format = format;
    this.publishedDate = publishedDate;
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

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public String getLike() {
    return like;
  }

  public void setLike(String like) {
    this.like = like;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(String publishedDate) {
    this.publishedDate = publishedDate;
  }

  @Override
  public String toString() {
    return "Tutorial{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", description='" + description + '\'' +
            ", rate='" + rate + '\'' +
            ", like='" + like + '\'' +
            ", content='" + content + '\'' +
            ", price='" + price + '\'' +
            ", salePrice='" + salePrice + '\'' +
            ", saleRate='" + saleRate + '\'' +
            ", type='" + type + '\'' +
            ", imageURL='" + imageURL + '\'' +
            ", published=" + published +
            ", format='" + format + '\'' +
            ", publishedDate=" + publishedDate +
            '}';
  }
}




