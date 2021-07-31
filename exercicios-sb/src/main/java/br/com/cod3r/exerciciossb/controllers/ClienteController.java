package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClienteporId1(@PathVariable int id) {
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping()
    public Cliente obterClientePorId2(
            @RequestParam(value = "id", defaultValue = "1") int id) {
        return new Cliente(id, "João Augusto", "111.222.333-44");
    }
}
