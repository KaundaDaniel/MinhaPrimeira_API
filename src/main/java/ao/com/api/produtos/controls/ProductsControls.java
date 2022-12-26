package ao.com.api.produtos.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ao.com.api.produtos.models.ProductsModels;
import ao.com.api.produtos.models.RespostaModelo;
import ao.com.api.produtos.service.ProductService;



@CrossOrigin(origins = "*")

@RestController
public class ProductsControls{
@Autowired
private ProductService ps;
@PostMapping("/cadastrar")

public ResponseEntity<?> cadastrar(@RequestBody ProductsModels pm){
    return ps.cadastrarEditar(pm, "Cadastrar");
}
@PutMapping("/editar")
public ResponseEntity<?> editar(@RequestBody ProductsModels pm){
    return ps.cadastrarEditar(pm, "Editar");
}
@GetMapping("/listar")
public Iterable <ProductsModels> listar (){
 return ps.listar();
}
@DeleteMapping("/apagar/{cod}")
public ResponseEntity<RespostaModelo> apagar(@PathVariable Long cod){
    return ps.apagar(cod);
}

    @GetMapping("/")
public String rota(){
    return"rota Funcionando";
}
}