package com.example.project.firstproject.Controller;

import com.example.project.firstproject.Service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Mycontroller {
    @Autowired
 private Myservice myservice;
    @GetMapping(path = "/get/{query}")
    public String getdata(@PathVariable("query") String query )
    {
        return ("This Api is working "+query);

    }

    @PostMapping(path = "/fetch")
    public String getdata1(@RequestBody String tabledata)
    {
        myservice.getdata(tabledata);
        return ("This Api is working "+tabledata);

    }
}
