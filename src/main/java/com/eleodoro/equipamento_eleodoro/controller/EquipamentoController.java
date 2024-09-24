package com.eleodoro.equipamento_eleodoro.controller;

import java.net.URI;

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

import com.eleodoro.equipamento_eleodoro.dto.EquipamentoDTO;
import com.eleodoro.equipamento_eleodoro.model.Equipamento;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/equipamento")
public class EquipamentoController {

    @Autowired
    private EquipamentoController equipamentoRepository;
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
      return "chegou na classe equipamento";
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<Equipamento> insert(@RequestBody EquipamentoDTO equipamentoDTO){
    
      Equipamento novoEquipamento = equipamentoDTO.novoEquipamento();
      //manutencaoRepository.save(novaManutencao);

      
      System.out.println("Chegou no metodo insert");
      System.out.println(equipamentoDTO.toString());
    
    
    //   URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
    //       .path("{/id}")
    //       .buildAndExpand(novoEquipamento.getId())
    //       .toUri();

      
      //return ResponseEntity.created(uri).body(novoEquipamento);
      return null;

    
    }

     
    @GetMapping(value = "/{id}")
    public ResponseEntity<Equipamento> buscarPorId(@PathVariable Long id) {
        
      //return equipamentoRepository.findById(id)
      //  .map(registro -> ResponseEntity.ok().body(registro))
      //  .orElse(ResponseEntity.notFound().build());

      return null;
        
    }
   @PostMapping(value="/{id}")
   public ResponseEntity<Void> update (@PathVariable Long id, @RequestBody Equipamento equipamento) {
     
    // Optional <Equipamento> equipamentoBanco= equipamentoRepository.findById(id);

    // Equipamento manutencaoModificado = equipamentoBanco.get();

    // equipamentoModificado.setLocal(equipamento.getLocal());

    // equipamentoRepository.save(equipamentoModificado);

    return ResponseEntity.noContent().build();
   }

}