package com.spring.recipeapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Category extends BaseEntity {

    @Column
    private String departmentName;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
