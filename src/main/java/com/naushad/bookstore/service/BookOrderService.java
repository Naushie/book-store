package com.naushad.bookstore.service;

import com.naushad.bookstore.entity.BookOrderEntity;

import java.util.List;

public interface BookOrderService {
    List<BookOrderEntity> getAllBookOrders();

    BookOrderEntity saveBookOrder(BookOrderEntity bookOrder);
}
