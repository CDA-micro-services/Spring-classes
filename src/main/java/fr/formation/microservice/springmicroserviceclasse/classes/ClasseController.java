package fr.formation.microservice.springmicroserviceclasse.classes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ClasseController {

    private final ClasseService classeService;

    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping("")
    public List<Classe> findAll() {
        return classeService.findAll();
    }

    @PostMapping("")
    public Classe save(@RequestBody Classe classe) {
        return classeService.save(classe);
    }

    @GetMapping("{id}")
    public Classe findById(@PathVariable String id) {
        return classeService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        classeService.deleteById(id);
    }

    @GetMapping("/listeIds")
    public List<Classe> findAllById(@RequestParam String ids) {
        List<String> arr = new ArrayList<>(Arrays.asList(ids.split(",")));
        return classeService.findAllById(arr);
    }
}
