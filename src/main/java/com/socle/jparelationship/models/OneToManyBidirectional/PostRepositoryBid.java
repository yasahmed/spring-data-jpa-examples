package com.socle.jparelationship.models.OneToManyBidirectional;

import com.socle.jparelationship.models.oneToManyUnidirectional.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepositoryBid extends JpaRepository<PostBid, Long> {

}