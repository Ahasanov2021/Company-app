package com.example.company_app.dto;

import com.example.company_app.model.Phone;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDto {

    Long id;
    String name;
    String surname;
    Integer age;
    List<PhoneDto> phones;
}
