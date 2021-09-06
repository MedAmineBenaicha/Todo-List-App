package com.todo.app.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="person_id")
    @JsonBackReference
    private Person person;

    public Authority() {
    }
}
