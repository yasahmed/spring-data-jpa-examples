package com.socle.jparelationship.models.manyToMany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepositoryX extends JpaRepository<PostX, Long> {

}