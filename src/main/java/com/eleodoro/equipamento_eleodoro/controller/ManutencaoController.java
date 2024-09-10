package com.eleodoro.equipamento_eleodoro.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.equipamento_eleodoro.dto.ManutencaoDTO;
import com.eleodoro.equipamento_eleodoro.model.Manutencao;
import com.eleodoro.equipamento_eleodoro.repository.ManutencaoRepository;

@RestController
@RequestMapping(value = "/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoRepository manutencaoRepository;
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
      return "chegou na classe manutencao";
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Manutencao> insert(@RequestBody ManutencaoDTO manutencaoDTO){
    
      Manutencao novaManutencao = manutencaoDTO.novaManutencao();
      //manutencaoRepository.save(novaManutencao);

      
      System.out.println("Chegou no metodo insert");
      System.out.println(manutencaoDTO.toString());
    
    
      URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
          .path("{/id}")
          .buildAndExpand(novaManutencao.getId())
          .toUri();

      
      return ResponseEntity.created(uri).body(novaManutencao);

    
    }

     
    @GetMapping(value = "/{id}")
    public ResponseEntity<Manutencao> buscarPorId(@PathVariable Long id) {
        
      //return manutencaoRepository.findById(id)
      //  .map(registro -> ResponseEntity.ok().body(registro))
      //  .orElse(ResponseEntity.notFound().build());

      return null;
        
    }
  

}