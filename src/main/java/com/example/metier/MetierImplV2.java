package com.example.metier;

import com.example.dao.IDao;

public class MetierImplV2 implements IMetier {

    private static final double TVA = 0.20;

    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        if (dao == null) {
            throw new IllegalStateException("Le DAO n'a pas été injecté.");
        }

        double prixHT = dao.getValue();
        double prixTTC = prixHT * (1 + TVA);

        System.out.println("[METIER V2] Prix HT = " + prixHT + " -> Prix TTC = " + prixTTC);
        return prixTTC;
    }
}