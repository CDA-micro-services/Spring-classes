package fr.formation.microservice.springmicroserviceclasse.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classe {

    @Id
    private String id;
    private String nom;
    private List<String> elevesList;
    private List<String> professeursList;
    private List<String> sallesList;
}
