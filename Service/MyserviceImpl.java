package com.example.project.firstproject.Service;

import com.example.project.firstproject.Repository.Repo;
import org.springframework.data.jpa.repository.Query;

public class MyserviceImpl implements Myservice {
    private Repo repo;
    @Override
    public void getdata(String tabledata) {
        repo.tabledata;


    }
}
