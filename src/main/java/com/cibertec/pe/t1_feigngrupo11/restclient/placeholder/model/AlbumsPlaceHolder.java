package com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.model;

public class AlbumsPlaceHolder {

    private Integer userId;
    private Integer id;
    private String title;

    public AlbumsPlaceHolder() {
    }

    public AlbumsPlaceHolder(Integer userId, Integer id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
