package Unit1.Unit1StringOpsLab;

public class StringOps
{
    // Write a static method called awesomeness that takes a String called name as its formal parameter. 
    // This method returns a greeting of the form "I know name is awesome."

    public static String awesomeness(String name)
    {
        return "I know " + name + " is awesome.";
    }
    
    // Write a static method called indexFirstSpace that takes a String called name as its formal parameter. 
    // This method returns the position of the first space
    // precondition: name has at least one space
    
    public static int indexFirstSpace(String name)
    {
        return name.indexOf(" ");
    }
    
    // Write a static method called indexSecondSpace that takes a String called name as its formal parameter. 
    // This method returns the position of the second space
    // precondition: name has at least two spaces
    // For full credit, you must call a StringOps method(s) that you have already written
    
    public static int indexSecondSpace(String name)
    {
        return name.indexOf(" ", indexFirstSpace(name) + 1);
    }
    
    // Write a static method called firstName that takes a String called name as its formal parameter. 
    // This method returns the first name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // For full credit, you must call a StringOps method(s) that you have already written
       
    public static String firstName(String name)
    {
        return name.substring(0, indexFirstSpace(name));
    }
    
    // Write a static method called lastName that takes a String called name as its formal parameter. 
    // This method returns the last name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // For full credit, you must call a StringOps method(s) that you have already written
    
    public static String lastName(String name)
    {
        return name.substring(indexSecondSpace(name) + 1);
    }
    
    // Write a static method called middleName that takes a String called name as its formal parameter. 
    // This method returns the middle name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // For full credit, you must call a StringOps method(s) that you have already written
    
    public static String middleName(String name)
    {
        return name.substring(indexFirstSpace(name) + 1, indexSecondSpace(name));
    }
   
    // Write a static method called lastFirstMidInitial that takes a String called name as its formal parameter. 
    // This method returns last name, first name, middle initial
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // postcondition: returns name in the form "Leonard, Kawhi, A"
    // For full credit, you must call a StringOps method(s) that you have already written    
    
    public static String lastFirstMidInitial(String name)
    {
        return lastName(name) + ", " + firstName(name) + ", " + middleName(name).substring(0, 1);
    }
    
}