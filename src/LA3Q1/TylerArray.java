package LA3Q1;

// Custom Array with a few methods allowing implementation as a stack or queue
public class TylerArray extends Pair<Integer, String>
{
    // Fields
    private Pair<Integer, String>[] testArray;

    // Default Constructor
    public TylerArray()
    {
        testArray = new Pair[0];
    }

    // Get the size of the array
    public int getSize()
    {
        return testArray.length;
    }

    // Remove the last pair in the array (copy into a new array and return the removed item)
    public Pair<Integer, String> removeFromLastIndex()
    {
        // Ensure there's a pair in the array to pop
        if (getSize() != 0)
        {
            // Create the new array
            Pair<Integer, String>[] newArray = new Pair[getSize() - 1];

            // Get the last pair
            Pair<Integer, String> lastPair = testArray[getSize() - 1];

            // Copy into new array, neglecting the last pair
            System.arraycopy(testArray, 0, newArray, 0, getSize() - 1);

            // Replace the old array with the new array
            testArray = newArray;

            // Return the removed pair
            return lastPair;
        }

        // Return null for empty array
        else
        {
            return null;
        }
    }

    // Remove the first pair in the array (copy into a new array and return the removed item)
    public Pair<Integer, String> removeFromFirstIndex()
    {
        // Ensure there's a pair in the array to pop
        if (getSize() != 0)
        {
            // Create the new array
            Pair<Integer, String>[] newArray = new Pair[getSize() - 1];

            // Get the first pair
            Pair<Integer, String> firstPair = testArray[0];

            // Copy into new array, neglecting the first pair
            System.arraycopy(testArray, 1, newArray, 0, getSize() - 1);

            // Replace the old array with the new array
            testArray = newArray;

            // Return the removed pair
            return firstPair;
        }

        // Return null for empty array
        else
        {
            return null;
        }
    }

    // Add a new pair to the end of the array
    public void addAtLastIndex(Pair<Integer, String> p)
    {
        // Create the new array
        Pair<Integer, String>[] newArray = new Pair[getSize() + 1];

        // Copy into new array
        System.arraycopy(testArray, 0, newArray, 0, getSize());

        // Add the given pair
        newArray[getSize()] = p;

        // Replace the old array with the new array
        testArray = newArray;
    }

    // Print the array as a string
    @Override
    public String toString()
    {
        // Open the array
        String str = "[";

        // Concatenate items in array
        for (int i = 0; i < getSize(); i++)
        {
            str += testArray[i].toString() + ", ";
        }

        // Delete extra ", " at the end if we added elements
        if (getSize() > 0)
            str += "\b\b";

        // Close the array
        str += "]";

        // Return the final string
        return str;
    }
}
