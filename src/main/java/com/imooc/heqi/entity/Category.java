package com.imooc.heqi.entity;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
@Entity
@Data
@DynamicUpdate
@Table(name = "category_")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
