package com.example.company_app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BranchRequest {

    @NotBlank
    String name;
    @NotBlank
    String address;
    @Positive
    Integer countOfEmployees;
    List<PhoneRequest> phones;

}
