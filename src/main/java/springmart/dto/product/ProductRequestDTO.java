package springmart.dto.product;

public record ProductRequestDTO(String name, Double price, Integer quantityInStorage) {
}
