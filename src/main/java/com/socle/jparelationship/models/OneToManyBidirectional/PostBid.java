package com.socle.jparelationship.models.OneToManyBidirectional;


import com.socle.jparelationship.models.oneToManyUnidirectional.AuditModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Table(name = "postsBid")
public class PostBid extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String title;

    @NotNull
    @Size(max = 250)
    private String description;

    @NotNull
    @Lob
    private String content;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "postBid")
    private Set<CommentBid> commentBids = new HashSet<>();

    public PostBid(String post_title, String post_description, String post_content) {
        super();
        this.setTitle(post_title);
        this.setContent(post_content);
        this.setDescription(post_description);
    }

    // Getters and Setters (Omitted for brevity)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<CommentBid> getCommentBids() {
        return commentBids;
    }

    public void setCommentBids(Set<CommentBid> commentBids) {
        this.commentBids = commentBids;
    }
}