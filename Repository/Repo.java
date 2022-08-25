package com.example.project.firstproject.Repository;

import com.example.project.firstproject.Entity.bef0030t;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<bef0030t,Long> {

    @Query(value = "POLICY = ? AND CLASS = ? AND EFFECTIVE-DATE = ?
            [
            "767000123456",
            "A08",
            "2022-01-01"
            ]")

}
