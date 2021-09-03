package br.edu.cesmac.si.atividade.resource;

import br.edu.cesmac.si.atividade.model.Pessoa;
import br.edu.cesmac.si.atividade.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/Pessoas")

public class PessoaResources {

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> lista() {
        return pessoaRepository.findAll();
    }

    @GetMapping(params = "nome")
    public List<Pessoa> pesquisaPorNome(@RequestParam String nome) {
        return null;
    }

    @PostMapping
    public Pessoa insere(@Validated @RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    @PutMapping
    public Pessoa altera(@RequestBody Pessoa pessoa) {

        return pessoaRepository.save(pessoa);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Pessoa> busca(@PathVariable ("id") Long id) {
        return pessoaRepository.findById(id).map(pessoa -> ResponseEntity.ok(pessoa)).
                orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public void deleta(@PathVariable("id") Long id) {
        pessoaRepository.deleteById(id);
    }
}
