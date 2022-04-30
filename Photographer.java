package myobserver;

public abstract class Photographer {
    String name;
    String camera;

    public Photographer(String name, String camera) {
        this.name = name;
        this.camera = camera;
    }

    public void takePhoto() {
        System.out.println(this.name + " taking photo with a camera " + this.camera);
    }

}
