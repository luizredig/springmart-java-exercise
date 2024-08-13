package springmart.dto.product;

import springmart.classes.Product;

import java.util.UUID;

public record ProductResponseDTO(UUID id, String name, Double price, int quantityInStorage) {
    public ProductResponseDTO(Product product) {
        this(product.getId(), product.getName(), product.getPrice(), product.getQuantityInStorage());
    }
}
