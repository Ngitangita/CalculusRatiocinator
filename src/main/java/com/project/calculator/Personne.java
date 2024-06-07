package com.project.calculator;


import com.project.calculator.enumes.VeriteEtMensonge;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
public final class Personne {
    private final CalculusRatiocinator calculusRatiocinator;
    private final String name;

    public Personne(String name) {
        this.name = name;
        this.calculusRatiocinator = new CalculusRatiocinator();
    }

    public void ajouterAffirmation(Affirmation affirmation) {
        calculusRatiocinator.ajouterAffirmation(affirmation);
    }

    public VeriteEtMensonge evaluerAffirmation(Affirmation affirmation) {
        return calculusRatiocinator.evaluerAffirmation(affirmation);
    }

    public VeriteEtMensonge evaluerAffirmations(Affirmation premierAffirmation, Affirmation deuxiemeAffirmation, Conjonction conjonction) {
        return calculusRatiocinator.evaluerAffirmation(premierAffirmation, deuxiemeAffirmation, conjonction);
    }
}
