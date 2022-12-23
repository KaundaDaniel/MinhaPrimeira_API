package ao.com.api.produtos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ao.com.api.produtos.models.ProductsModels;

@Repository

public interface ProductRepository extends CrudRepository<ProductsModels, Long> {
    
}
