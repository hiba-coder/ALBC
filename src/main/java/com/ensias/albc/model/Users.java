package com.ensias.albc.model;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user;
    private String Username;
    private String Email;
    private String Profile_pic;
    private Date Birth_date;
    private String First_name;
    private String Middle_name;
    private String Last_name;
    private String Phone;
    private String Bio;
    private String Verified;
    private String Created_at;
    private String Notifications;


    public Users(int id_user, String username, String email, String profile_pic, Date birth_date, String first_name, String middle_name, String last_name, String phone, String bio, String verified, String created_at, String notifications) {
        this.id_user = id_user;
        Username = username;
        Email = email;
        Profile_pic = profile_pic;
        Birth_date = birth_date;
        First_name = first_name;
        Middle_name = middle_name;
        Last_name = last_name;
        Phone = phone;
        Bio = bio;
        Verified = verified;
        Created_at = created_at;
        Notifications = notifications;
    }

    public Users() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getProfile_pic() {
        return Profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        Profile_pic = profile_pic;
    }

    public Date getBirth_date() {
        return Birth_date;
    }

    public void setBirth_date(Date birth_date) {
        Birth_date = birth_date;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getMiddle_name() {
        return Middle_name;
    }

    public void setMiddle_name(String middle_name) {
        Middle_name = middle_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public String getVerified() {
        return Verified;
    }

    public void setVerified(String verified) {
        Verified = verified;
    }

    public String getCreated_at() {
        return Created_at;
    }

    public void setCreated_at(String created_at) {
        Created_at = created_at;
    }

    public String getNotifications() {
        return Notifications;
    }

    public void setNotifications(String notifications) {
        Notifications = notifications;
    }
}
