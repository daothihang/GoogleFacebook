package com.daothihang.facebook.models;

import io.realm.RealmObject;

public class UserFacebook extends RealmObject {
    private String id;
    private String first_name;
    private String url;
    private String last_name;
    private String email;

    public UserFacebook() {

    }

    @Override
    public String toString() {
        return "UserFacebook{" +
                "id='" + id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", url='" + url + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public UserFacebook(String id, String first_name, String url, String last_name, String email) {
        this.id = id;
        this.first_name = first_name;
        this.url = url;
        this.last_name = last_name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
