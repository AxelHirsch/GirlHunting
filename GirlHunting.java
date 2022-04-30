package myobserver;

public class GirlHunting {
    public static void main(String[] args) {
        NudeBeach beach = new NudeBeach();

        Observer bigAssLower = new ManBigAssLower("John Smith", "Canon EOS Mark V with lens Canon EF 200-400mm f/4L IS USM Extender 1.4x");
        Observer bigBobsLower = new ManBigBobsLower("Bill Eagle", "Nikon D90 with AF-S DX NIKKOR 18-55mm f/3.5-5.6G VR II");
        Observer girlLower = new ManGirlLower("Tom Hill", "Sony A600 with Sony SELP18105G E PZ 18-105mm F4 G OSS");

        beach.addObserver(bigAssLower);
        beach.addObserver(bigBobsLower);
        beach.addObserver(girlLower);

        Girl vanessa = new Girl(false, true, "Red");
        beach.addGirl(vanessa);
        System.out.println();

        Girl angelina = new Girl(true, false, "Black");
        beach.addGirl(angelina);
        System.out.println();

        Girl lily = new Girl(true, true, "White");
        beach.addGirl(lily);
        System.out.println();

    }
}
