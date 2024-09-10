package com.eleodoro.equipamento_eleodoro.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.equipamento_eleodoro.dto.FornecedorDTO;
import com.eleodoro.equipamento_eleodoro.model.Fornecedor;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {
    
    @GetMapping (value = "/imprimir")
    public String imprimir(){

       return "chegou ate fornecedor";

    }
    @PostMapping (value= "/insert")
    public ResponseEntity<Fornecedor> insert (@RequestBody FornecedorDTO fornecedorDTO) {

        Fornecedor novoFornecedor=fornecedorDTO.novoFornecedor();
        fornecedorDTORepository.save(novoFornecedor);

        System.out.println("chegou no método insert");
        System.out.println(fornecedorDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path{"{/id}")
        .BuildAndExpand(Fornecedor.getID())
        .toUri();

        return ResponseEntity.created(uri).body(novoFornecedor);
    }

    }
    @PutMapping(value ="/{id}"

    public ResponseEntity<void> update (@PathVariable Long id, @RequestBody Fornecedor fornecedor) 

        Optional<Fornecedor> fornecedorBanco=fornecedorBanco = fornecedorRepository.finalById(id);
        
        Fornecedor FornecedorModificado= fornecedorBanco.get();
        Manutenç
    }
}
