package com.naushad.bookstore.api;

import com.naushad.bookstore.entity.BookOrderEntity;
import com.naushad.bookstore.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book-order")
public class BookOrderAPI {

    private BookOrderService bookOrderService;

    @Autowired
    public BookOrderAPI(BookOrderService bookOrderService) {
        this.bookOrderService = bookOrderService;
    }

    @GetMapping
    public List<BookOrderEntity> getAllOrders() {
        return bookOrderService.getAllBookOrders();
    }

    @PostMapping
    public BookOrderEntity orderBook(BookOrderEntity bookOrder) {
        return bookOrderService.saveBookOrder(bookOrder);
    }
}
