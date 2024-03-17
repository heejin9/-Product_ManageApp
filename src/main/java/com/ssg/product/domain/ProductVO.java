package com.ssg.product.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductVO {

    private Long pno;
    private String pname;
    private double price;
    private int quantity;
}
