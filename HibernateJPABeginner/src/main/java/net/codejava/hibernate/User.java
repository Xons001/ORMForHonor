package net.codejava.hibernate;

import javax.persistence.*;

/**
 * User.java
 * Copyright by CodeJava.net
 */

@Entity
@Table(name = "USERS")
public class User {
    private Integer id;
    private String fullname;
    private String email;
    private String password;
    
    @Column(name = "USER_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name = "FULLNAME")
    public String getFullname() {
        return fullname;
    }
 
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}
