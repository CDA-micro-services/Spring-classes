package fr.formation.microservice.springmicroserviceclasse.classes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClasseRepository extends MongoRepository<Classe, String> {

}
