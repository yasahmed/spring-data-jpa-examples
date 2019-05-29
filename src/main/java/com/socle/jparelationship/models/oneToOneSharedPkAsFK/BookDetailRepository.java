package com.socle.jparelationship.models.oneToOneSharedPkAsFK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDetailRepository extends JpaRepository<BookDetail, Integer>{
}