package com.socle.jparelationship.models.oneToOneSharedPkAsFK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
}