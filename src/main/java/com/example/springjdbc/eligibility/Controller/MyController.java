package com.example.springjdbc.eligibility.Controller;

import com.example.springjdbc.eligibility.DAO.DAO_Implementation;
import com.example.springjdbc.eligibility.Entity.BEF0030T;
import com.example.springjdbc.eligibility.Service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private Myservice myservice;
    @PostMapping (path = "/get")
    public List getdata(@RequestBody String tablequery)
    {

     List<BEF0030T> results = myservice.getAll(tablequery);
     return(results);
    }
}
