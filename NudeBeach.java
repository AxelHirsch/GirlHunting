package myobserver;

import java.util.ArrayList;
import java.util.List;

public class NudeBeach implements Observed {
    List<Girl> girls = new ArrayList<>();

    List<Observer> men = new ArrayList<>();

    public void addGirl(Girl girl) {
        this.girls.add(girl);
        notifyObserver(girl);
    }

    public void addObserver(Observer man) {
        this.men.add(man);
    }

    @Override
    public void notifyObserver(Girl girl) {
        for (Observer observer : men) {
            observer.checkingGirl(girl);
        }
    }
}
