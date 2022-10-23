package org.nai.utils;

import fuzzy4j.flc.Term;
import org.nai.utils.enums.Dirtiness;
import org.nai.utils.enums.WashingTime;
import org.nai.utils.enums.TypeOfDirt;
import org.nai.utils.enums.Weight;

import java.util.HashMap;
import java.util.Map;

/**
 * Terms Setup Loader for inputs/outputs
 * @author Mikołaj Kalata
 * @author Adam Lichy
 *
 */
public class WashingMachineSetups {

    public final static Map<Dirtiness, Term> dirtinessOfClothesTerms = loadDiritinessTerms();
    public final static Map<Weight, Term> weightTerms = loadWeightTerms();
    public final static Map<TypeOfDirt, Term> typeOfDirtTerms = loadTypeOfDirtTerms();
    public final static Map<WashingTime, Term> washingTimeTerms = loadWashingTimeTerms();

    /**
     * load dirtiness terms
     * @return termsMap for Dirtiness terms
     */
    private static Map<Dirtiness, Term> loadDiritinessTerms() {
        Map<Dirtiness, Term> dirtinessTerms = new HashMap<>();
        dirtinessTerms.put(Dirtiness.SLIGHTY,
                Term.term(Dirtiness.SLIGHTY.getDirtiness(), 0.0, 0.25, 0.5));
        dirtinessTerms.put(Dirtiness.NORMAL,
                Term.term(Dirtiness.NORMAL.getDirtiness(), 0.25, 0.5, 0.75));
        dirtinessTerms.put(Dirtiness.VERY,
                Term.term(Dirtiness.VERY.getDirtiness(), 0.5, 0.75, 1.0));
        return dirtinessTerms;
    }

    /**
     * load weight terms
     * @return termsMap for Weight terms
     * unit: kg
     */
    private static Map<Weight, Term> loadWeightTerms() {
        Map<Weight, Term> weightTerms = new HashMap<>();
        weightTerms.put(Weight.LIGHT,
                Term.term(Weight.LIGHT.getWeight(), 0.0, 3.0, 6.0));
        weightTerms.put(Weight.NORMAL,
                Term.term(Weight.NORMAL.getWeight(), 3.0, 6.0, 9.0));
        weightTerms.put(Weight.HEAVY,
                Term.term(Weight.HEAVY.getWeight(), 6.0, 9.0, 12.0));
        return weightTerms;
    }

    /**
     * load type of dirt terms
     * @return termsMap for TypeOfDirt terms
     */
    private static Map<TypeOfDirt, Term> loadTypeOfDirtTerms() {
        Map<TypeOfDirt, Term> typeOfDirtTerms = new HashMap<>();
        //TODO add terms
        return typeOfDirtTerms;
    }

    /**
     * load washing time terms
     * @return termsMap for WashingTime terms
     * unit: minute
     */
    private static Map<WashingTime, Term> loadWashingTimeTerms() {
        Map<WashingTime, Term> washingTimeTerms = new HashMap<>();
        washingTimeTerms.put(WashingTime.SHORT,
                Term.term(WashingTime.SHORT.getTime(), 15.0, 30.0, 45.0));
        washingTimeTerms.put(WashingTime.MEDIUM,
                Term.term(WashingTime.MEDIUM.getTime(), 30.0, 45.0, 60.0));
        washingTimeTerms.put(WashingTime.LONG,
                Term.term(WashingTime.LONG.getTime(), 60.0, 90.0, 120.0));
        return washingTimeTerms;
    }
}