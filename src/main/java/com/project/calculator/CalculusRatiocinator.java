package com.project.calculator;

import com.project.calculator.enumes.VeriteEtMensonge;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class CalculusRatiocinator {
    private final Map<String, Affirmation> affirmations;

    public CalculusRatiocinator() {
        this.affirmations = new HashMap<>();
    }

    public void addAffirmation(Affirmation affirmation) {
        affirmations.put(affirmation.getDescription(), affirmation);
    }

    public VeriteEtMensonge evaluer(Affirmation affirmation){
        if(affirmations.containsKey(affirmation.getDescription())){
            return affirmation.evaluer();
        } else {
            return VeriteEtMensonge.JENESAISPAS;
        }
    }
}
