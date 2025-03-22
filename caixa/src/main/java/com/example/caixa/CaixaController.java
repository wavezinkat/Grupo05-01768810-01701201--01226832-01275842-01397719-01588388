package com.example.caixa;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class CaixaController {

    private static Double saldo = 0.0;

    @GetMapping
    public SaldoDTO consultar(){
        return new SaldoDTO(saldo);
    }

    @PutMapping
    public void depositar(@RequestBody ValorDTO depositar) {
        saldo += depositar.valor();
    }

    @PostMapping(path = "/sacar")
    public void sacar(@RequestBody ValorDTO sacar) {
        if(saldo>=sacar.valor()){
            saldo -= sacar.valor();
        }else{
            throw new RuntimeException("Saldo insuficiente");
        }
    }

}
