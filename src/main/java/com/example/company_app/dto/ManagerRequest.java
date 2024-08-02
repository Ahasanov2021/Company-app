package com.example.company_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManagerRequest {

    String name;
    String surname;
    Integer age;
    List<PhoneRequest> phones;

}
