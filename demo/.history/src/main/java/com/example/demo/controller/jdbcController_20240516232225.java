package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.List;
@RestController
public class jdbcController<JdbcTemplate> {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //写一个list请求，查询数据库信息
    @GetMapping("/list")
    public List<Map<String,Object>> list(){

        String sql="select * from students";
        List<Map<String,Object>> list_map=jdbcTemplate.queryForList(sql,jdbcTemplate);
        return list_map;

    }

}
