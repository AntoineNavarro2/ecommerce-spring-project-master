package com.antoine.ecommerce.model;


import lombok.Data;


import javax.persistence.*;

@Entity
@Data

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category.id", referencedColumnName = "category.id")
    private Category category;
    private double price;
    private String time;
    private String description;
    private String imageName;
}
