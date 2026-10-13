package com.example.dao;

import java.util.List;

public class DaoImplV2 implements IDao {

    // Simule des lignes lues dans une table (prix HT de trois produits)
    private final List<Double> donnees = List.of(150.0, 250.0, 200.0);

    @Override
    public double getValue() {
        System.out.println("[DAO V2] Lecture de " + donnees.size() + " enregistrements...");
        // Retourne la moyenne des valeurs
        return donnees.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}