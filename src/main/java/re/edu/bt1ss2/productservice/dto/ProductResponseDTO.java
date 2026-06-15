package re.edu.bt1ss2.productservice.dto;


public class ProductResponseDTO {
    private Long id;
    private String name;
    private Double sellPrice;

    public ProductResponseDTO(Long id, String name, Double sellPrice) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSellPrice() {
        return sellPrice;
    }
}
