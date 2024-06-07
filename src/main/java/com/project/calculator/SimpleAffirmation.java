package com.project.calculator;


import com.project.calculator.enumes.VeriteEtMensonge;
import lombok.Getter;

@Getter
public class SimpleAffirmation extends Affirmation {
    private final VeriteEtMensonge veriteEtMensonge;

    public SimpleAffirmation(String description, VeriteEtMensonge veriteEtMensonge) {
        super(description);
        this.veriteEtMensonge = veriteEtMensonge;
    }

    @Override
    public VeriteEtMensonge evaluer() {
        return veriteEtMensonge;
    }
}
