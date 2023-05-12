package com.antoine.ecommerce.dto;

import lombok.Data;


@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private String time;
    private String description;
    private String imageName;

}
