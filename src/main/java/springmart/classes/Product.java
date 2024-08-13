package springmart.classes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springmart.dto.product.ProductRequestDTO;

import java.util.UUID;

@Table(name = "products")
@Entity(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Double price;
    private int quantityInStorage;

    public Product(ProductRequestDTO data){
        this.id = UUID.randomUUID();
        this.name = data.name();
        this.price = data.price();
        this.quantityInStorage = data.quantityInStorage();
    }
}