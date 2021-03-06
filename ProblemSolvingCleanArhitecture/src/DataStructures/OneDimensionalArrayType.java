package DataStructures;

public class OneDimensionalArrayType implements IDataStructures {

    private int LengthOfArray;
    private int[] Array = { 0 };


    public int GetLengthOfOneDimensionalArray() {

        return this.LengthOfArray;
    }


    public void SetLengthOfOneDimensionalArray(int NewValueLength) {

        this.LengthOfArray = NewValueLength;
    }

    public int[] GetOneDimensionalArray() {

        return this.Array;
    }

    public void SetOneDimensionalArray(int[] Array) {

        this.Array = Array;
    }

}
