package com.example.project.firstproject.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "BEF0030T")
public class bef0030t {
    @Id
    @Column(
            nullable = false
    )
    private Long Policy;
    @Column(
            nullable = false
    )
    private String Class;
    @Column(
            nullable = false
    )
    private String Effective_Date;

}
