package myobserver;

public class ManBigAssLower extends Photographer implements Observer {

    public ManBigAssLower(String name, String camera) {
        super(name, camera);

    }

    @Override
    public void checkingGirl(Girl girl) {
        if (girl.bigAss) {
            takePhoto();
        }
    }

}
