package com.ensias.albc.model;


import javax.persistence.*;

@Entity
@Table
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_search;
    private int id_user;
    private String search;

    public Search(int id_search, int id_user, String search) {
        this.id_search = id_search;
        this.id_user = id_user;
        this.search = search;
    }

    public Search() {
    }

    public int getId_search() {
        return id_search;
    }

    public void setId_search(int id_search) {
        this.id_search = id_search;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
