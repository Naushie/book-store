package com.naushad.bookstore.api;

import com.naushad.bookstore.entity.BookOrderEntity;
import com.naushad.bookstore.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secured/book-order")
public class BookOrderSecuredAPI {

    private BookOrderService bookOrderService;

    @Autowired
    public BookOrderSecuredAPI(BookOrderService bookOrderService) {
        this.bookOrderService = bookOrderService;
    }

    @GetMapping("/test")
    public String testBookOrderAPI(OAuth2AuthenticationToken authentication) {
        return "Hello " + authentication.getPrincipal().getAttribute("login");
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
