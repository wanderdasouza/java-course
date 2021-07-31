package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int somar(
            @PathVariable int a,
            @PathVariable int b
    ) {
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(
            @RequestParam("a") int a,
            @RequestParam("b") int b
    ) {
        return a - b;
    }
}
