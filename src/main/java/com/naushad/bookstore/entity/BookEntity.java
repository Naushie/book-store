package com.naushad.bookstore.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "book")
public class BookEntity extends BaseEntity {

    @Column(name = "isbn", nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String title;
}
