package com.ssg.product.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@ToString
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long pno;

    private String pname;

    private double price;

    private int quantity;
}
