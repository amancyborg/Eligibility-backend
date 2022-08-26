package com.example.springjdbc.eligibility.Entity;

import lombok.*;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BEF0030T {
    public String getPolicy() {
        return Policy;
    }

    public String get_Class() {
        return Class;
    }

    public Date getEffective_Date() {
        return Effective_Date;
    }

    private String Policy;
    private String Class;
    private Date Effective_Date;

}
