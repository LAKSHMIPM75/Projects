public class Main1 {
 public static void main(String[] args)
    {
 
        // Instance of class is created
        // and value is assigned using constructor
        CallByReference object
            = new CallByReference(10, 20);
 
        System.out.println("Value of a: "
                           + object.a
                           + " & b: "
                           + object.b);
 
        // Changing values in class function
        object.ChangeValue(object);
 
        // Displaying values
        // after calling the function
        System.out.println("Value of a: "
                           + object.a
                           + " & b: "
                           + object.b);
    }
}