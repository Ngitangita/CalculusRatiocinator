package com.project.calculator.ConjonctionsLogiques;

import com.project.calculator.enumes.VeriteEtMensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoncTest {

    @Test
    void evaluer() {
        var donc = new Donc();
        assertEquals(VeriteEtMensonge.VRAI, donc.evaluer(VeriteEtMensonge.VRAI, VeriteEtMensonge.FAUX));
        assertEquals(VeriteEtMensonge.FAUX, donc.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.FAUX, donc.evaluer(VeriteEtMensonge.VRAI, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.FAUX, donc.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.FAUX));
    }
}