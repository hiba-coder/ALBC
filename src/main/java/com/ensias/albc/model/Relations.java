package com.ensias.albc.model;

import javax.persistence.*;

@Entity
@Table
public class Relations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_relation;
    private int follower;
    private int followed;

    public Relations(int id_relation, int follower, int followed) {
        this.id_relation = id_relation;
        this.follower = follower;
        this.followed = followed;
    }

    public Relations() {
    }

    public int getId_relation() {
        return id_relation;
    }

    public void setId_relation(int id_relation) {
        this.id_relation = id_relation;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public int getFollowed() {
        return followed;
    }

    public void setFollowed(int followed) {
        this.followed = followed;
    }
}
