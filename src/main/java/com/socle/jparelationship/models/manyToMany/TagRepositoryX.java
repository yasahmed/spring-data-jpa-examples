package com.socle.jparelationship.models.manyToMany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepositoryX extends JpaRepository<TagX, Long> {

}