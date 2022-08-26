package com.example.springjdbc.eligibility.DAO;


import com.example.springjdbc.eligibility.Entity.BEF0030T;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public interface Repository {

     List<BEF0030T> getAll(String Query, ArrayList<String> arrayList);

}
