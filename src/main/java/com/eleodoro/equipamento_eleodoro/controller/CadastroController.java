package com.eleodoro.equipamento_eleodoro.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.equipamento_eleodoro.dto.CadastroDTO;
import com.eleodoro.equipamento_eleodoro.model.Cadastro;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {
 
    @GetMapping(value = "/imprimir")
    public void imprimir(){
        System.out.println("chegou em cadastro");
    }
   

    @PostMapping(value = "/insert")
    public ResponseEntity<Cadastro> insert(@RequestBody CadastroDTO cadastroDTO){

        Cadastro novoCadastro = cadastroDTO.novoCadastro();
        cadastroRepository.save(novoCadastro);


        System.out.println("chegou no metodo insert");
        System.out.println(cadastroDTO.toString());

        Uri uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("{/id}")
            .BuildAndExpand(novoCadastro.getId())
            .toUri();

        return ResponseEntity.created(uri).body(novoCadastro);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity <Void> update (@PathVariable Long id, @ResponseBody Cadastro cadastro){
        Optional <Cadastro> cadastroBanco = cadastroRepository.findById (id);
        Cadastro cadastroModificado = cadastroBanco.get();
        cadastroModificado.setNome(cadastro.getNome());
        cadastroRepository.save(cadastroModificado);
        return ResponseEntity.noContent().build();
    }

} 
