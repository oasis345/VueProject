package com.chae.web.entityes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Table(name ="users")

public class User implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="user_id") private String userId;
    @Column(name="user_name") private String userName;
    @Column(name="password") private String password;
    @Column(name="email") private String email;

    @Builder
    private User(String userId,
                 String userName,
                 String password,
                 String email){
                     this.userId = userId;
                     this.userName = userName;
                     this.password = password;
                     this.email = email;
    }

}