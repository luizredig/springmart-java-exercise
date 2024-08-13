package springmart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springmart.classes.Product;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
}
