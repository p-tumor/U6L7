public class ArrayAlgorithms {
    // ADD THE FOLLOWING METHODS TO THE OTHERS IN THIS CLASS!

    /** Shifts all elements in numList to the LEFT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The first shiftNum elements of the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {3, 4, 7, 6, 5, 1} (all elements shifted left
     *  two with the first two elements wrapping around to the back)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {7, 6, 5, 1, 3, 4}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumLeftModify(int[] numList, int shiftNum)

    {
        int temp = numList[numList.length-1];
        for(int i = 0;i < shiftNum;i++){
            if (i == 0) {
                numList[numList.length-1] = numList[0];
                i++;
            }
            numList[i-1] = numList[i];
            if(i == numList.length-1) numList[numList.length-2] = temp;
        }

    }
}
