package com.dailycodework.dreamshops.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category {
    // nếu khong muon return category id when find product
    // thi tao category DTO giong nhu image DTO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    // avoid loop in api result
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category(String name) {
        this.name = name;
    }
}
