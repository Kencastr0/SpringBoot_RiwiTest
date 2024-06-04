package com.riwi.domain.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INT(11)")
    private Long id;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String text;

    @Column(length = 50, nullable = false)
    private String type;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "survey_id")
    private Survey surveyId;

    @Column(nullable = false)
    private boolean active;

    @OneToMany(mappedBy = "questionId", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    private List<OptionQuestion> options = new ArrayList<>();

}
