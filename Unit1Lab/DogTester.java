package Unit1Lab;

public class DogTester {
    public static void main(String[] args) {
        Dog micro = new Dog("micro", 1, 123, "123L");
        System.out.println(micro.toString());
        Dog wave = new Dog("wave", 2, 728, "728W");
        System.out.println(wave.toString());
        Dog grapes = new Dog("grapes", 4, 631, "631P");
        System.out.println(grapes.toString());
        System.out.println();
        System.out.println(micro.getName() + " human years: " + micro.convertToHumanYears());
        System.out.println(wave.getName() + " human years: " + wave.convertToHumanYears());
        System.out.println(grapes.getName() + " human years: " + grapes.convertToHumanYears());
        System.out.println();
        System.out.println(micro.getName() + " ID Check: " + micro.getDogIDCheck());
        System.out.println(wave.getName() + " ID Check: " + wave.getDogIDCheck());
        System.out.println(grapes.getName() + " ID Check: " + grapes.getDogIDCheck());
        System.out.println();
        System.out.println(micro.getName() + " dog tag: " + micro.createDogTag());
        System.out.println(wave.getName() + " dog tag: " + wave.createDogTag());
        System.out.println(grapes.getName() + " dog tag: " + grapes.createDogTag());
    }
}
