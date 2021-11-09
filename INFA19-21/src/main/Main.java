package main;

public class Main {

    public static void main(String[] args) throws Exception {
        Human.Hemulixa hemulixa = Human.Hemulixa.getHemulixa();
        Human.LittleHemulixa littleHemulixa = Human.LittleHemulixa.getInstance();
        Human.Snork snork = Human.Snork.getInstance();
        Human.Baby baby = Human.Baby.getInstance();
        Human.Snusmumrik snusmumrik = Human.Snusmumrik.getInstance();
        Sun sun = new Sun();

        hemulixa.open();
        hemulixa.ask();
        hemulixa.walk();
        snork.walk();
        snusmumrik.walk();
        hemulixa.drink();
        littleHemulixa.bake();
        snork.standUp();
        snork.talk();
        hemulixa.cry();
        littleHemulixa.treat();
        baby.givePosterToSnusmumrik(snusmumrik);
        snusmumrik.combine();
        snusmumrik.look();
        snusmumrik.understand();
        sun.goDown();
        snusmumrik.doSomething();
    }
}