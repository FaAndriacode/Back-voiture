package com.example.demo.services.voiture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.voiture.Categorie;
import com.example.demo.repository.voiture.CategorieRepository;

@Service
public class CategorieService {
    private final CategorieRepository categorieRepository;

    @Autowired
    public CategorieService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> findAllCategorie(){
        // Utilisez la méthode du référentiel pour récupérer tous les documents
        List<Categorie> categorie =categorieRepository.findAll();
        return categorie;
    }
}
