package re.edu.bt1ss2.productservice.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private Long id;
    private String name;
    private String sku;
    private Double importPrice;
    private Double sellingPrice;
    private Integer stockQuantity;

}
