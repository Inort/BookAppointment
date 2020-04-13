package com.example.demo.entity;

public class BookEntity {
    private long bookId;
    private String name;
    private String introd;
    private int number;

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntrod() {
        return introd;
    }

    public void setIntrod(String introd) {
        this.introd = introd;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", introd='" + introd + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
