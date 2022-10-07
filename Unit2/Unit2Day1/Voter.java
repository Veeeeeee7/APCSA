package Unit2.Unit2Day1;

public class Voter {
    
    private String name;
    private int age;
    private String state;
    private String county;
    private boolean isRegistered;

    public static void main(String[] args) {
        // Voter bari = new Voter("Bari", true);
        // System.out.println(bari);

        // Voter lauren = new Voter("Lauren", 16, "Hawaii", "Honolulu", true);

        // boolean a, b, c;
        // a = false;
        // b = true;
        // c = false;

        // System.out.println(!a || (b && c) ? "T" : "F");
        // System.out.println(a ? "a: T" : b ? "b: T" : c ? "c: T" : "F");
        Voter bob = new Voter("Bob", 18, "California", "LA", false);
        System.out.println(bob.canVote());
    }

    //Overloading
    public Voter(String name, boolean isRegistered) {
        // this keyword "this" calls the constructor with the most parameters and fills in the rest with defaults and custom values
        this(name, 18, "CA", "San Diego", isRegistered);
    }

    //Constructor
    public Voter(String name, int age, String state, String county, boolean isRegistered) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.county = county;
        this.isRegistered = isRegistered;
    }

    //Methods
    public boolean checkCARegistration() {
        // if (state.equals("California")) {
        //     if (age >= 18) {
        //         if (isRegistered == true) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        return state.equals("California") && age >= 18 && isRegistered;
    }

    public boolean checkCADriver() {
        if (state.equals("California") || isRegistered) {
            if (age >= 16) {
                return true;
            }
        }
        return false;
    }

    public String canVote() {
        return checkCARegistration() ? "You can vote!" : age < 18 ? "You are underage" : "You are not registered";
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public String toString() {
        return "Voter [age=" + age + ", county=" + county + ", isRegistered=" + isRegistered + ", name=" + name
                + ", state=" + state + "]";
    }    
}


