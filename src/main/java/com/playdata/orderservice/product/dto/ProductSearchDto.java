package com.playdata.orderservice.product.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductSearchDto {

    private String category;
    private String searchName;

}
