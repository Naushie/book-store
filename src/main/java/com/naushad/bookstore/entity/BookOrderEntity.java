package com.naushad.bookstore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "book_order")
public class BookOrderEntity extends BaseEntity{

    @JoinColumn(name = "book_isbn", referencedColumnName = "isbn", nullable = false)
    @ManyToOne
    private BookEntity book;

    private String quantity;

}
