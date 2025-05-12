import java.util.ArrayList;
public class WhileLoop
{
    /*
    The following code removes a name from a list. 
    Set the found variable to the appropriate true or false 
    values at line 20 and line 27 to make the code work.
    And change the return statement on line 34 to 
    return the variable found
    */
   private ArrayList<String> nameList;

   public WhileLoop(ArrayList<String> nameList)
   {
       this.nameList = nameList;
   }

   public boolean removeName(String name)
   {
    //   boolean found =   true or false?
       int index = 0;
       while (index < nameList.size())
       {
           if (name.equals(nameList.get(index)))
           {
               nameList.remove(index);
            //   found =   true or false?
           }
           else
           {
               index++;
           }
       }
       return false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Amun");
        myList.add("Ethan");
        myList.add("Donnie");
        myList.add("Ethan");
        WhileLoop listWorker = new WhileLoop(myList);
        System.out.println(listWorker.nameList);
        listWorker.removeName("Ethan");
        System.out.println("After removing Ethan: "
                  + listWorker.nameList);
    }
}