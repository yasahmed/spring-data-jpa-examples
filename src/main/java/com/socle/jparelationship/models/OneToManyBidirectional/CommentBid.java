package com.socle.jparelationship.models.OneToManyBidirectional;

import com.socle.jparelationship.models.oneToManyUnidirectional.AuditModel;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "commentsBid")
public class CommentBid extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private PostBid postBid;

    public CommentBid(String s) {
        super();
        this.setText(s);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PostBid getPostBid() {
        return postBid;
    }

    public void setPostBid(PostBid postBid) {
        this.postBid = postBid;
    }


// Getters and Setters (Omitted for brevity)
}