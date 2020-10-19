package ProblemSolution;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class ProblemSolution implements IProblemSolution {

    IDataStructures Data;
    IValidations Validation;

    public ProblemSolution() {

        Data = new DataStructuresFactory().GetOneDimensionalArrayTypeObject();
        Validation = new ValidationsFactory().GetValidationsObject();
    }

    public void SolutionName() {

    }
}
