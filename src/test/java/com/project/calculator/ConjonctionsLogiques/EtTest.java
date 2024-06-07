package com.project.calculator.ConjonctionsLogiques;

import com.project.calculator.enumes.VeriteEtMensonge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EtTest {

    @Test
    void evaluer() {
        var et = new Et();
        assertEquals(VeriteEtMensonge.FAUX, et.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.FAUX));
        assertEquals(VeriteEtMensonge.FAUX, et.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.VRAI, et.evaluer(VeriteEtMensonge.VRAI, VeriteEtMensonge.VRAI));
        assertEquals(VeriteEtMensonge.FAUX, et.evaluer(VeriteEtMensonge.FAUX, VeriteEtMensonge.FAUX));
    }
}