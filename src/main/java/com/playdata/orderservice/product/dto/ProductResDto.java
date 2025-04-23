package com.playdata.orderservice.product.dto;

import com.playdata.orderservice.product.entity.Product;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResDto {

    private Long id;
    private String name;
    private String category;
    private int price;
    private int stockQuantity;
    private String imagePath;

    public Product toEntity() {
        return Product.builder()
                .id(id)
                .name(name)
                .category(category)
                .price(price)
                .stockQuantity(stockQuantity)
                .imagePath(imagePath)
                .build();
    }
}
