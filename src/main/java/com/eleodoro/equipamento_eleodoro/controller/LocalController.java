package com.eleodoro.equipamento_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.equipamento_eleodoro.dto.LocalDTO;
import com.eleodoro.equipamento_eleodoro.model.Local;
import com.eleodoro.equipamento_eleodoro.repository.LocalRepository;


@RestController
@CrossOrigin("*")
@RequestMapping(value = "/local")
public class LocalController {

    @Autowired
    private LocalRepository localRepository;
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
      return "chegou na classe local";
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<Local> insert(@RequestBody LocalDTO localDTO){
    
      Local novoLocal = localDTO.novoLocal();
      localRepository.save(novoLocal);

      
      System.out.println("Chegou no metodo insert");
      System.out.println(localDTO.toString());
    
    
      URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
          .path("{/id}")
          .buildAndExpand(novoLocal.getId())
          .toUri();

      
      return ResponseEntity.created(uri).body(novoLocal);

    
    }

     
    @GetMapping(value = "/{id}")
    public ResponseEntity<Local> buscarPorId(@PathVariable Long id) {
        
      //return localRepository.findById(id)
      //  .map(registro -> ResponseEntity.ok().body(registro))
      //  .orElse(ResponseEntity.notFound().build());

      return null;
        
    }

  //  @PostMapping(value="/{id}")
  //  public ResponseEntity<Void> update (@PathVariable Long id, @RequestBody Local local) {
     
  //   Optional <Local> localBanco= localRepository.findById(id);

  //   Local localModificado = localBanco.get();

  //   localModificado.setLocal(local.getLocal());

  //   localRepository.save(localModificado);

  //   return ResponseEntity.noContent().build(); 
  //  }
 
 // @DeleteMapping
 //public ResponseEntity<Local> delete(@PathVariable Long id){
   // if(LocalRepository.existsById(id)){
     //  LocalRepository.deleteById(id);
       //return ResponseEntity.noContent().build();
    //}
    return ResponseEntity.notFound().build();
}
}