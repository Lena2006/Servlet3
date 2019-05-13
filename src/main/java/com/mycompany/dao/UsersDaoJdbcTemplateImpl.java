/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.models.User;
import java.sql.ResultSet;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class UsersDaoJdbcTemplateImpl implements UsersDao {

    private JdbcTemplate template;
    private final String SQL_SELECT_ALL = 
            "SELECT * FROM fix_user";
    
    private Map<Integer, User> usersMap = new HashMap<>();
     private final String SQL_SELECT_USER = 
             "SELECT *FROM fix_user WHERE fix_user.id = ?";
     private final String SQL_SELECT_ALL_BY_FIRST_NAME = 
             "SELECT *FROM fix_user WHERE first_name = ?";
     public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
         this.template = new JdbcTemplate(dataSource);
     } 
         private RowMapper<User> userRowMapper
                 = (ResultSet resultSet, int i) -> {
                 Integer id = resultSet.getInt("id");
                 if(!userMap.containsKey(id)) {
                 Strting firstName = ResultSet.getString("first_name");
                 String lastName = ResultSet.gatString("last_name");
                 userMap.put(id, user);
                 }
return usersMap.get(id);
    @Override
    public List<User> findAllByFirstName(String firstName) {
                 return temlate.query(SQL_SELECT_USER, userRowMapper,id);
                 
    }

    @Override
    public Optional<User> find(Integer id) {
template.query(SQL_SELECT_USER, userRowMapper, id);
if (usersMap.containsKey(id)) {
    return Optional.of(userMap.get(id));
                 }
                 return Optional.empty();
}
                 
                 
    @Override
    public void save(User madel) {
    }

    @Override
    public void update(User model) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public List<User> findAll() {
                     return template.query(SQL_SELECT_ALL, userRowMapper);
                 }
    
     
    

