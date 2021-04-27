package br.uniso.cadastro.controller;

import br.uniso.cadastro.model.entity.Pessoa;
import br.uniso.cadastro.model.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository repository;
    @PostMapping("/cadastro/criar")
    public boolean createPessoa(@RequestBody Pessoa pessoinha){

        Pessoa gravado = repository.save(pessoinha);
        if(gravado == null)return false;
        else return true;
    }
    @GetMapping("/cadastro")
    public List<Pessoa> getPessoa(){
        return repository.findAll();
    }
    @PutMapping("/cadastro/editar")
    public boolean putPessoa(@RequestBody Pessoa pessoinha){
        Pessoa gravado = repository.save(pessoinha);
        if(gravado == null)return false;
        else return true;
    }

}
