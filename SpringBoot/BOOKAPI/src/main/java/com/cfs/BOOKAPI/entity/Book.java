package com.cfs.BOOKAPI.entity;

public class Book {

    private Long id;

    private String title;

    private Double author;

    private Double price;

    public Book()
    {

    }

    public Book(Long id, String title, Double author, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAuthor() {
        return author;
    }

    public void setAuthor(Double author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
