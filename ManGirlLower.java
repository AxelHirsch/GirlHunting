package myobserver;

public class ManGirlLower extends Photographer implements Observer {

    public ManGirlLower(String name, String camera) {
        super(name, camera);
    }

    @Override
    public void checkingGirl(Girl girl) {
        takePhoto();
    }
}
