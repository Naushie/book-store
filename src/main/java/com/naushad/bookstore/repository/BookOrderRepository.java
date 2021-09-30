package com.naushad.bookstore.repository;

import com.naushad.bookstore.entity.BookOrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookOrderRepository extends CrudRepository<BookOrderEntity, Integer> {
}
