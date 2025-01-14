package com.udangtangtang.backend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class Tag extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column(nullable = false)
    private Long userId;

    public Tag(String name, Article article, Long userId) {
        this.name = name;
        this.article = article;
        this.userId = userId;
    }
}
