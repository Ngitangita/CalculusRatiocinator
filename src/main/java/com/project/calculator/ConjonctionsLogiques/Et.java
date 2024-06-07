package com.project.calculator.ConjonctionsLogiques;

import com.project.calculator.Conjonction;
import com.project.calculator.enumes.VeriteEtMensonge;

public class Et extends Conjonction {
    @Override
    protected VeriteEtMensonge evaluer(VeriteEtMensonge a, VeriteEtMensonge b) {
        if (a == VeriteEtMensonge.VRAI && b == VeriteEtMensonge.VRAI) {
            return VeriteEtMensonge.VRAI;
        }
        return VeriteEtMensonge.FAUX;
    }
}
