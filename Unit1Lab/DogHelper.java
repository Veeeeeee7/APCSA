package Unit1Lab;

public class DogHelper {
    public static char computeDogIDCheck(int id) {
        int sum = 0;
        int temp = 1;
        while (temp <= id) {
            sum += (id/temp)%10;
            temp *= 10;
        }
        return (char)(70+sum);
    }

    public static boolean checkDogTag(String dogTag) {
        // return parseInt(dogTag) == (Integer.toString(dogID) +);
        return false;
    }
}