package Testing;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import ProblemSolution.IProblemSolution;
import ProblemSolution.ProblemSolutionFactory;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class Testing implements ITesting {

    IDataStructures Data;
    IValidations Validations;
    IProblemSolution ProblemSolution;

    public Testing() {

        Data = new DataStructuresFactory().GetOneDimensionalArrayTypeObject();
        Validations = new ValidationsFactory().GetValidationsObject();
        ProblemSolution = new ProblemSolutionFactory().GetProblemSolutionObject();
    }

    public void TestCaseOne() {

    }
}
