package Unit3.Day2;

public class House {
    private boolean toiletSeatDown;
    private String wallpaper;
    private int temperature;

    private static String HOA_PRESIDENT = "Mr. Lopez";
    // Static: creates only 1 copy regardless of how many objects are created

    public static void main(String[] args) {
        House home = new House();
        // System.out.println(home.toString());

        House friendHouse = House.clone(home);
        System.out.println(home);

        House.crash(home);
        System.out.println(home);
        System.out.println(friendHouse);
    }

    public House(boolean toiletSeatDown, String wallpaper, int temperature) {
        this.toiletSeatDown = toiletSeatDown;
        this.wallpaper = wallpaper;
        this.temperature = temperature;
    }

    public House(boolean toiletSeatDown, String wallpaper) {
        this(toiletSeatDown, wallpaper, 72);
    }

    public House(boolean toiletSeatDown) {
        this(toiletSeatDown, "Flower Polka-Dot");
    }

    public House() {
        this(true);
    }

    public static void crash(House crashPad) {
        crashPad.setTemperature(100);
        crashPad.setWallpaper("Flamingo");
        crashPad.setToiletSeatDown(false);
    }

    public static House clone(House blueprint) {
        House clone = new House(blueprint.isToiletSeatDown(), blueprint.getWallpaper(), blueprint.getTemperature());
        return clone;
    }

    public boolean isToiletSeatDown() {
        return toiletSeatDown;
    }

    public void setToiletSeatDown(boolean toiletSeatDown) {
        this.toiletSeatDown = toiletSeatDown;
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(String wallpaper) {
        this.wallpaper = wallpaper;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return String.format("House Status\n\tIs toilet seat down? %1$s\n\tWallpaper: %2$s\n\tTempearture: %3$s",
                toiletSeatDown, wallpaper, temperature);
    }
}
