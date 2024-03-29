package Unit1.Unit1StringOpsLab;

public class StringOpsTester 
{

    public static void main(String[] args) 
    {
        // instantiate a String object that represents your name. First, Middle and Last seperated by a space. Store your name in a variable called fullName
        String fullName = "Robert Dru Reed";
        
        
        // call the method awesomeness in the parameter of println
        
        System.out.println(StringOps.awesomeness(fullName));
        
        // call the appropriate methods after the + 
        
        System.out.println("Index of 1st Space: " + StringOps.indexFirstSpace(fullName));

        System.out.println("Index of 2nd Space: " + StringOps.indexSecondSpace(fullName));

        System.out.println("The first name is " + StringOps.firstName(fullName));

        System.out.println("The last name is " + StringOps.lastName(fullName));

        System.out.println("The middle name is " + StringOps.middleName(fullName));

        System.out.println("Last Name, First Name, Middle Initial is " + StringOps.lastFirstMidInitial(fullName));

        
        // call the method firstName and store the returned value a variable called first

        String first = StringOps.firstName(fullName);

        // call the method lastName and store the returned value a variable called last

        String last = StringOps.lastName(fullName);

        // call the compareTo method after the +

        System.out.println("The result when comparing the first name to the last name using Java’s compareTo() method is " + first.compareTo(last));

    }

}