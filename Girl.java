package myobserver;

public class Girl implements WigglingHipsShakingBobs {
    boolean bigBobs;
    boolean bigAss;
    String hairColor;

    public Girl(boolean bigBobs, boolean bigAss, String hairColor) {
        this.bigBobs = bigBobs;
        this.bigAss = bigAss;
        this.hairColor = hairColor;
        wigglingHips();
        shakingBobs();
    }

    @Override
    public void wigglingHips() {
        if (bigAss == true) {
            System.out.println("The girl walks and her ass is shaking");
        }
    }

    @Override
    public void shakingBobs() {
        if (bigBobs == true) {
            System.out.println("The girl walks and her bobs is shaking");
        }
    }
}
