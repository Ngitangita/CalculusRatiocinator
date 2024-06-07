package com.project.calculator;

import com.project.calculator.enumes.VeriteEtMensonge;

public abstract class Conjonction {
    protected abstract VeriteEtMensonge evaluer(VeriteEtMensonge a, VeriteEtMensonge b);
}
