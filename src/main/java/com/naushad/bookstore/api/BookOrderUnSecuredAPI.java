package com.naushad.bookstore.api;

import com.naushad.bookstore.entity.BookOrderEntity;
import com.naushad.bookstore.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unsecured/book-order")
public class BookOrderUnSecuredAPI {

    private BookOrderService bookOrderService;
    @Autowired
    public BookOrderUnSecuredAPI(BookOrderService bookOrderService) {
        this.bookOrderService = bookOrderService;
    }

    @GetMapping("/test")
    public String testBookOrderAPI() {
        return "Hello ";
    }

    @GetMapping
    public List<BookOrderEntity> getAllOrders() {
        return bookOrderService.getAllBookOrders();
    }

    @PostMapping
    public BookOrderEntity orderBook(@RequestBody BookOrderEntity bookOrder) {
        return bookOrderService.saveBookOrder(bookOrder);
    }
}
