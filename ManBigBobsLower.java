package myobserver;

public class ManBigBobsLower extends Photographer implements Observer {
    public ManBigBobsLower(String name, String camera) {
        super(name, camera);
    }

    @Override
    public void checkingGirl(Girl girl) {
        if (girl.bigBobs) {
            takePhoto();
        }
    }
}
