package com.example.dinsta.Model;

public class User {
    String bio;
    String email;
    String id;
    String imageurl;
    String name;
    String username;

    public User() {
    }

    public User(String bio, String email, String id, String imageurl, String name, String username) {
        this.bio = bio;
        this.email = email;
        this.id = id;
        this.imageurl = imageurl;
        this.name = name;
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
