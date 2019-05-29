package com.socle.jparelationship.models.oneToOneSharedPkAsFK;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class MainApp implements CommandLineRunner {
    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Book and BookDetail
        bookRepository.save(new Book("Hello Koding 1", new BookDetail(101)));
        bookRepository.save(new Book("Hello Koding 2", new BookDetail(102)));
    }
}