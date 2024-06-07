package com.project.calculator;

import com.project.calculator.enumes.VeriteEtMensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    void ajouterAffirmation() {
        var lou = new Personne("Lou");
        var verite1 = new SimpleAffirmation("Lou est beau", VeriteEtMensonge.VRAI.VRAI);
        var mensonge1 = new SimpleAffirmation("Lou est pauvre", VeriteEtMensonge.FAUX);

        lou.ajouterAffirmation(verite1);
        lou.ajouterAffirmation(mensonge1);

        assertTrue(lou.getCalculusRatiocinator().getAffirmations().contains(verite1));
        assertTrue(lou.getCalculusRatiocinator().getAffirmations().contains(mensonge1));
    }

    @Test
    void evaluerAffirmation() {
        var lou = new Personne("Lou");
        var verite = new SimpleAffirmation("Lou est beau", VeriteEtMensonge.VRAI);
        var mensonge = new SimpleAffirmation("Lou est pauvre", VeriteEtMensonge.FAUX);

        lou.ajouterAffirmation(verite);
        lou.ajouterAffirmation(mensonge);

        assertEquals(VeriteEtMensonge.VRAI, lou.evaluerAffirmation(verite));
        assertEquals(VeriteEtMensonge.FAUX, lou.evaluerAffirmation(mensonge));
    }

    @Test
    void evaluerAffirmations() {
        var lou = new Personne("Lou");

        var verite = new SimpleAffirmation("Lou est beau", ValeurDeVerite.VRAI);
        var mensonge = new SimpleAffirmation("Lou est pauvre", ValeurDeVerite.FAUX);
        var affirmation = new SimpleAffirmation("Lou est généreux", ValeurDeVerite.JENESAISPAS);

        lou.ajouterAffirmation(verite);
        lou.ajouterAffirmation(mensonge);
        lou.ajouterAffirmation(affirmation);

        var et = new Et();
        var ou = new Ou();
        var donc = new Donc();

        var louEstPauvreEtlouEstGenereux = lou.evaluerAffirmations(mensonge, affirmation, et);
        assertEquals(ValeurDeVerite.FAUX, louEstPauvreEtlouEstGenereux);

        var louEstBeauDoncLouEstPauvre = lou.evaluerAffirmations(verite, mensonge, donc);
        assertEquals(ValeurDeVerite.VRAI, louEstBeauDoncLouEstPauvre);

        var louEstPauvreDoncLouEstGenereux = lou.evaluerAffirmations(mensonge, affirmation, donc);
        assertEquals(ValeurDeVerite.FAUX, louEstPauvreDoncLouEstGenereux);

        var louEstBeauOuLouEstGenereuxDoncLouEstPauvre = new CompositeAffirmation("Lou est beau ou Lou est généreux", verite, affirmation, ou);
        var result = lou.evaluerAffirmations(louEstBeauOuLouEstGenereuxDoncLouEstPauvre, mensonge, donc);
        assertEquals(ValeurDeVerite.JENESAISPAS, result);
    }

    @Test
    void obtenirCalculusRatiocinator() {
        var lou = new Personne("Lou");
        assertNotNull(lou.getCalculusRatiocinator());
    }
}
