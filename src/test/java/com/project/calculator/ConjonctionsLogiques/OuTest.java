package com.project.calculator.ConjonctionsLogiques;

import com.project.calculator.enumes.VeriteEtMensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OuTest {
    @Test
    void evaluer() {
        var ou = new Ou();
        assertEquals(VeriteEtMensonge.FAUX, ou.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.FAUX));
        assertEquals(VeriteEtMensonge.VRAI, ou.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.VRAI, ou.evaluer(VeriteEtMensonge.VRAI, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.VRAI, ou.evaluer(VeriteEtMensonge.VRAI, VeriteEtMensonge.FAUX));
    }
}