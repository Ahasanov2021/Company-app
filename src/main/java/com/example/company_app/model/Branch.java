package com.example.company_app.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String address;
    Integer countOfEmployees;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinTable(
            name = "branch_phone",
            joinColumns = @JoinColumn(name = "branch_id"),
            inverseJoinColumns = @JoinColumn(name = "phone_id"))
    List<Phone> phones;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    Manager manager;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "company_id")
    Company company;

}
