package com.example.springjdbc.eligibility.Service;

import com.example.springjdbc.eligibility.DAO.DAO_Implementation;
import com.example.springjdbc.eligibility.DAO.Repository;
import com.example.springjdbc.eligibility.Entity.BEF0030T;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@Component
public class MyserviceImpl implements Myservice {

    @Autowired
    Repository repository;
    @Override
    public  List<BEF0030T> getAll(String Query) {
       String myString = Query;
       String input_sql = "";
       String select_sql = "Select * from BEF0030T WHERE ";

       String parameters = "";
       boolean first_line = false;
        Scanner scanner = new Scanner(myString);
       try {
           while (scanner.hasNextLine() ) {
               if (first_line) {

                   parameters += scanner.nextLine();
               }
               else {
                   input_sql = scanner.nextLine();
                   first_line = true;
               }
           }
       }
       finally {
           scanner.close();
       }
       select_sql = select_sql + input_sql;

        JSONArray jsonArray = new JSONArray(parameters);
        ArrayList<String> parameterlist = new ArrayList<String>();
        for (int i = 0; i < jsonArray.length(); i++) {
            parameterlist.add(jsonArray.getString(i));
        }

//        Iterator iterator = parameterlist.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
//        repository.getAll(Query);

        return repository.getAll(select_sql,parameterlist);

    }
}
