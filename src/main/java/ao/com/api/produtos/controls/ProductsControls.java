package ao.com.api.produtos.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ao.com.api.produtos.models.ProductsModels;
import ao.com.api.produtos.service.ProductService;



@RestController
public class ProductsControls{
@Autowired
private ProductService ps;
@GetMapping("/listar")
public Iterable <ProductsModels> listar (){
 return ps.listar();
}



    @GetMapping("/")
public String rota(){
    return"rota Funcionando";
}
}