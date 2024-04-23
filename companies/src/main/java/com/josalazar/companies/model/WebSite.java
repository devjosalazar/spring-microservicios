package com.josalazar.companies.model;

import com.josalazar.companies.model.eum.Category;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class WebSite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "category")
    @Enumerated(value = EnumType.STRING)
    private Category category;
    private String description;
}
