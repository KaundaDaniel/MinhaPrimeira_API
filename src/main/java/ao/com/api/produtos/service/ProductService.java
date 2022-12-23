package ao.com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ao.com.api.produtos.models.ProductsModels;
import ao.com.api.produtos.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository pr;
    public Iterable<ProductsModels> listar(){
        return pr.findAll();
    }
}
