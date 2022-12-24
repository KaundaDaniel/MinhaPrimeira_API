package ao.com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ao.com.api.produtos.models.ProductsModels;
import ao.com.api.produtos.models.RespostaModelo;
import ao.com.api.produtos.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;
    @Autowired private RespostaModelo rm;
    public Iterable<ProductsModels> listar(){
        return pr.findAll();
    }

    //Metodo para cadastrar ou Editar produto
      public ResponseEntity<?> cadastrarEditar(ProductsModels pm, String acao){
        if(pm.getName().equals("")){
            rm.setMessege("Nome do Produto é Obrigatorio!");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST );
        }else if(pm.getMark().equals("")){
            rm.setMessege("Nome da Marca Obrigatorio!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        }else{
         if (acao.equals("Cadastrar")){
            return new  ResponseEntity<ProductsModels>(pr.save(pm), HttpStatus.CREATED);
        }else{
            return new  ResponseEntity<ProductsModels>(pr.save(pm), HttpStatus.OK);
        }
        

      }
    }
}
