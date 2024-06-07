package com.project.calculator;

import com.project.calculator.ConjonctionsLogiques.Et;
import com.project.calculator.enumes.VeriteEtMensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculusRatiocinatorTest {

@Test
void addAffirmation() {
    var cr = new CalculusRatiocinator();
    var affirmation1 = new SimpleAffirmation("Lou est beau", VeriteEtMensonge.VRAI);
    var affirmation2 = new SimpleAffirmation("Lou est pauvre", VeriteEtMensonge.FAUX);

    cr.addAffirmation(affirmation1);
    cr.addAffirmation(affirmation2);

    assertEquals(2, cr.getAffirmations().size());
    assertTrue(cr.getAffirmations().containsKey("Lou est beau"));
    assertTrue(cr.getAffirmations().containsKey("Lou est pauvre"));
}

@Test
void evaluerSimpleAffirmation() {
    var cr = new CalculusRatiocinator();
    var affirmation1 = new SimpleAffirmation("Lou est beau", VeriteEtMensonge.VRAI);
    var affirmation2 = new SimpleAffirmation("Lou est pauvre", VeriteEtMensonge.FAUX);
    cr.addAffirmation(affirmation1);
    cr.addAffirmation(affirmation2);
    assertEquals(VeriteEtMensonge.VRAI, cr.evaluer(affirmation1));
    assertEquals(VeriteEtMensonge.FAUX, cr.evaluer(affirmation2));
}

@Test
void evaluerCompositeAffirmation() {
    var cr = new CalculusRatiocinator();
    var affirmation1 = new SimpleAffirmation("Lou est beau", VeriteEtMensonge.VRAI);
    var affirmation2 = new SimpleAffirmation("Lou est pauvre", VeriteEtMensonge.FAUX);
    var compositeAffirmation = new CompositeAffirmation("Lou est beau et Lou est pauvre", affirmation1, affirmation2, new Et());
    cr.addAffirmation(compositeAffirmation);
    assertEquals(VeriteEtMensonge.FAUX, cr.evaluer(compositeAffirmation));
}

}