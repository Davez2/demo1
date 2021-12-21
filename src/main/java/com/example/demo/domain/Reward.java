package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "REWARDS")
@AttributeOverride(name = "id", column = @Column(name = "reward_id"))
public class Reward {

    @Id
    @Column(name = "ID",insertable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "REWARD_TITLE", length = 50)
    private String title;
    @Column(name = "REWARD_YEAR")
    private Integer year;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
