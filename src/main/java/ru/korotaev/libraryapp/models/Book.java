package ru.korotaev.libraryapp.models;

public class Book {
    private Long isbn;
    private String book;
    private String author;
    private int year;

    public Book(Long isbn, String book, String author, int year) {
        this.isbn = isbn;
        this.book = book;
        this.author = author;
        this.year = year;
    }

    public Book() {}

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
