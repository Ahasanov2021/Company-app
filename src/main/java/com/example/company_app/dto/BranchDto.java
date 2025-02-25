package com.example.company_app.dto;

import com.example.company_app.model.Manager;
import com.example.company_app.model.Phone;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BranchDto extends BranchRequest {

    Long id;

}
