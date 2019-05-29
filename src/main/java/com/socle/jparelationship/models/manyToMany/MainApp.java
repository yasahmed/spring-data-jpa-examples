package com.socle.jparelationship.models.manyToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    private TagRepositoryX tagRepository;

    @Autowired
    private PostRepositoryX postRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Cleanup the tables
        postRepository.deleteAllInBatch();
        tagRepository.deleteAllInBatch();

        // =======================================

        // Create a Post
        PostX post = new PostX("Hibernate Many to Many Example with Spring Boot",
                "Learn how to map a many to many relationship using hibernate",
                "Entire Post content with Sample code");

        // Create two tags
        TagX tag1 = new TagX("Spring Boot");
        TagX tag2 = new TagX("Hibernate");


        // Add tag references in the post
        post.getTags().add(tag1);
        post.getTags().add(tag2);

        // Add post reference in the tags
        tag1.getPosts().add(post);
        tag2.getPosts().add(post);

        postRepository.save(post);


    }
}
