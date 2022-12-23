package ao.com.api.produtos.controls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsControls{
    @GetMapping("/")
public String rota(){
    return"rota Funcionando";
}
}