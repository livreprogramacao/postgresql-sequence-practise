package br.com.livreprogramacao.practise;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabio Santos Almeida <livre.programacao at gmail.com>
 */
@Entity
@Table(name = "user_data")
public class UserData {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private String userid;

    @Column(name = "username")
    private String username;

    @Column(name = "age")
    private int age;

    @Column(name = "location")
    private int location;

    @Column(name = "sent_count")
    private int sentCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }
}
