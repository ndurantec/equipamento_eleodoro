package com.eleodoro.equipamento_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {
    
    @GetMapping (value = "/imprimir")
    public String imprimir(){

       return "chegou ate fornecedor";

    }
}
