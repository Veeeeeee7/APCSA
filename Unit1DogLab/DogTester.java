package Unit1DogLab;

public class DogTester {
    public static void main(String[] args) {
        Dog micro = new Dog("micro", 1, 123, "123L");
        System.out.println(micro.toString());
        Dog wave = new Dog("wave", 2, 728, "728W");
        System.out.println(wave.toString());
        Dog grapes = new Dog("grapes", 4, 631, "631P");
        System.out.println(grapes.toString());

        System.out.println("\n" + micro.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(micro.getDogTag()));
        System.out.println(wave.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(wave.getDogTag()));
        System.out.println(grapes.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(grapes.getDogTag()));
        System.out.println("586M is a real dog tag? " + DogHelper.checkDogTag("586M"));
    }
}
