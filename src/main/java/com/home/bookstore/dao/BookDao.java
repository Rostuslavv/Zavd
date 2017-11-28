package com.home.bookstore.dao;

import com.home.bookstore.model.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(int id);

    Book getBookById(int id);

    List<Book> listBooks();

}
