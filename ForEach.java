import java.util.ArrayList;

public class ForEach
{
    /*
    What does the following code do? Guess before you run it. 
    Then, add another enhanced for each loop that computes the product 
    of all the elements in myList by multiplying them. 
    Print out the product after the new loop.
    */
    
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(50);
        myList.add(30);
        myList.add(20);
        
        // Compute the sum of all elements
        int total = 0;
        for (Integer value : myList)
        {
            total += value;
        }
        System.out.println("Sum of all elements: " + total);

        // Compute the product of all elements
        int product = 1;  // Start with 1 since multiplying by 0 will result in 0
        for (Integer value : myList)
        {
            product *= value;
        }
        System.out.println("Product of all elements: " + product);
    }
}