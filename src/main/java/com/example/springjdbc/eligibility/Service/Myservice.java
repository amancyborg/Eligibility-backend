package com.example.springjdbc.eligibility.Service;

import com.example.springjdbc.eligibility.Entity.BEF0030T;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Myservice {
    List<BEF0030T> getAll(String Query);
}
