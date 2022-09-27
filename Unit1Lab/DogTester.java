package Unit1Lab;

public class DogTester {
    public static void main(String[] args) {
        Dog micro = new Dog("micro", 1, 123, "123L");
        System.out.println(micro.toString());
        Dog wave = new Dog("wave", 2, 728, "728W");
        System.out.println(wave.toString());
        Dog grapes = new Dog("grapes", 4, 631, "631P");
        System.out.println(grapes.toString());

        System.out.println("\n" + micro.getName() + " human years: " + micro.convertToHumanYears());
        System.out.println(wave.getName() + " human years: " + wave.convertToHumanYears());
        System.out.println(grapes.getName() + " human years: " + grapes.convertToHumanYears());

        System.out.println("\n" + micro.getName() + " ID Check: " + DogHelper.computeDogIDCheck(micro.getDogID()));
        System.out.println(wave.getName() + " ID Check: " + DogHelper.computeDogIDCheck(wave.getDogID()));
        System.out.println(grapes.getName() + " ID Check: " + DogHelper.computeDogIDCheck(grapes.getDogID()));

        System.out.println("\n" + micro.getName() + " dog tag: " + micro.createDogTag());
        System.out.println(wave.getName() + " dog tag: " + wave.createDogTag());
        System.out.println(grapes.getName() + " dog tag: " + grapes.createDogTag());

        System.out.println("\n" + micro.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(micro.getDogTag()));
        System.out.println(wave.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(wave.getDogTag()));
        System.out.println(grapes.getDogTag() + " is a real dog tag? " + DogHelper.checkDogTag(grapes.getDogTag()));
        System.out.println("586M is a real dog tag? " + DogHelper.checkDogTag("586M"));
    }
}
