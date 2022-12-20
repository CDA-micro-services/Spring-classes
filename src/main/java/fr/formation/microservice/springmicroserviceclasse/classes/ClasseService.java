package fr.formation.microservice.springmicroserviceclasse.classes;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {
    private final ClasseRepository classeRepository;

    public ClasseService(ClasseRepository classeRepository) {
        this.classeRepository = classeRepository;
    }

    public List<Classe> findAll() {
        return classeRepository.findAll();
    }

    public Classe save(Classe classe) {
        return classeRepository.save(classe);
    }

    public Classe findById(String id) {
        return classeRepository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deleteById(String s) {
        classeRepository.deleteById(s);
    }

    public List<Classe> findAllById(List<String> ids) {
        return classeRepository.findAllById(ids);
    }
}
