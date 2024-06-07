package com.project.calculator;

import com.project.calculator.enumes.VeriteEtMensonge;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Affirmation {
    private final String description;

    public abstract VeriteEtMensonge evaluer();
}
