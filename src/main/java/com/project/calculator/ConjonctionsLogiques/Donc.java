package com.project.calculator.ConjonctionsLogiques;

import com.project.calculator.Conjonction;
import com.project.calculator.enumes.VeriteEtMensonge;

public class Donc extends Conjonction {
    @Override
    public VeriteEtMensonge evaluer(VeriteEtMensonge a, VeriteEtMensonge b) {
        if (a == VeriteEtMensonge.VRAI && b == VeriteEtMensonge.FAUX) {
            return VeriteEtMensonge.FAUX;
        }
        return VeriteEtMensonge.VRAI;
    }
}
