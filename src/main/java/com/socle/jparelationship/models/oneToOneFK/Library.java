package com.socle.jparelationship.models.oneToOneFK;

import javax.persistence.*;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(unique = true)
    private Address address;

    public Library(String name, Address address) {
        this.name = name;
        this.address = address;
        this.address.setLibrary(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}