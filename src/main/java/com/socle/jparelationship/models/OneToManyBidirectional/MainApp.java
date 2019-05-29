package com.socle.jparelationship.models.OneToManyBidirectional;

import com.socle.jparelationship.models.oneToManyUnidirectional.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@RequiredArgsConstructor
@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    private PostRepositoryBid postRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a PostBid
        PostBid postBid = new PostBid("postBid title", "postBid description", "postBid content");

        // Create Comments
        CommentBid commentBid1 = new CommentBid("Great PostBid!");
        commentBid1.setCreatedAt(new Date());
        commentBid1.setUpdatedAt(new Date());

        commentBid1.setPostBid(postBid);
        CommentBid commentBid2 = new CommentBid("Really helpful PostBid. Thanks a lot!");
        commentBid2.setCreatedAt(new Date());
        commentBid2.setUpdatedAt(new Date());
        commentBid2.setPostBid(postBid);

        // Add comments in the PostBid
        postBid.getCommentBids().add(commentBid1);
        postBid.getCommentBids().add(commentBid2);

        // Save PostBid and Comments via the PostBid entity
        postBid.setCreatedAt(new Date());
        postBid.setUpdatedAt(new Date());
        postRepository.save(postBid);
    }
}