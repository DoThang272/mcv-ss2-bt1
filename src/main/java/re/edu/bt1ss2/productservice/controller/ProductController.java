package re.edu.bt1ss2.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import re.edu.bt1ss2.productservice.dto.ProductResponseDTO;
import re.edu.bt1ss2.productservice.entity.ProductEntity;

@RestController
public class ProductController {
    @GetMapping("/api/v1/products")
    public ProductResponseDTO getProduct() {

        ProductEntity entity = new ProductEntity(
                1L,
                "iPhone 15",
                "IP15-256-BL",
                18000000.0,
                25000000.0,
                50
        );

        ProductResponseDTO response = new ProductResponseDTO(
                entity.getId(),
                entity.getName(),
                entity.getSellingPrice()
        );

        return response;
    }
}
