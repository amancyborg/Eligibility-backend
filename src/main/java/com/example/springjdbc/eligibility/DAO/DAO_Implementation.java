package com.example.springjdbc.eligibility.DAO;

import com.example.springjdbc.eligibility.Entity.BEF0030T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DAO_Implementation implements Repository{

    RowMapper<BEF0030T> rowMapper = ((rs, rowNum) -> {
        BEF0030T bef0030T = new BEF0030T();
        bef0030T.setPolicy(rs.getString("Policy"));
        bef0030T.setClass(rs.getString("Class"));
        bef0030T.setEffective_Date(rs.getDate("Effective_Date"));
        return bef0030T;
    });
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DAO_Implementation(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<BEF0030T> getAll(String Query,ArrayList<String> arrayList) {


        String sql = Query;
        String inParams = String.join(",", arrayList.stream().map(id -> "?").collect(Collectors.toList()));
       return jdbcTemplate.query(String.format(sql,inParams),rowMapper,arrayList.toArray());
       //  return jdbcTemplate.query(sql,rowMapper,parameters);
    }

}
