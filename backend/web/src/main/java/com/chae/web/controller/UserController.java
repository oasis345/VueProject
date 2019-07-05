package com.chae.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;

import com.chae.web.domain.UserDTO;
import com.chae.web.entityes.User;
import com.chae.web.repositories.UserRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Return;

import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired UserDTO user;
    @Autowired UserRepository repo;
   
    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;
    }

    


    @PostMapping("")
    public HashMap<String,String> join(@RequestBody UserDTO dto){
        System.out.println("===========넘어옴=========" + dto.toString());
        HashMap<String,String> map = new HashMap<>();
        User entity = new User();
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        repo.save(entity); 
        map.put("RESULT","SUCCESE");
        return map;
    }

    @GetMapping("")
    public List<UserDTO> findAll(){
        System.out.println("=========find========");
        Iterable<User> entities = repo.findAll();
        List<UserDTO> list = new ArrayList<>();
        for(User s: entities){
            UserDTO cust = modelMapper().map(s,UserDTO.class);
            list.add(cust);
        }
        return list;
    }

    @PutMapping("/update")
    public HashMap<String,String> update(@RequestBody UserDTO dto) {
        System.out.println("업데이트");
        HashMap<String,String> map = new HashMap<>();
        User entity = repo.findById(dto.getId()).get();
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        repo.save(entity); // 
        map.put("result","succeese");
        return map;
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable String id) {
        System.out.println("dddddd");
        repo.deleteById(Long.parseLong(id));
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody UserDTO dto){
            System.out.println("로그인진입");
            
            
            UserDTO o = modelMapper().map(repo.findByUserIdAndPassword(dto.getUserId(), dto.getPassword()),UserDTO.class);
            
            System.out.println(o);
            return o;
        
    }



}