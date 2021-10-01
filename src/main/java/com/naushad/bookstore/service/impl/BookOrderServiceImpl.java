package com.naushad.bookstore.service.impl;

import com.naushad.bookstore.entity.BookOrderEntity;
import com.naushad.bookstore.repository.BookOrderRepository;
import com.naushad.bookstore.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookOrderServiceImpl implements BookOrderService {

    private BookOrderRepository bookOrderRepository;

    @Autowired
    public BookOrderServiceImpl(BookOrderRepository bookOrderRepository) {
        this.bookOrderRepository = bookOrderRepository;
    }

    @Override
    public List<BookOrderEntity> getAllBookOrders() {
        return (List<BookOrderEntity>) bookOrderRepository.findAll();
    }

    @Override
    public BookOrderEntity saveBookOrder(BookOrderEntity bookOrder) {
        return bookOrderRepository.save(bookOrder);
    }
}
