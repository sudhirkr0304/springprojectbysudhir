package com.sudhir.springproject1.repository;

import com.sudhir.springproject1.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
