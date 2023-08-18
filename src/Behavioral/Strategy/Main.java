package Behavioral.Strategy;

import Behavioral.Strategy.Eat.eat;
import Behavioral.Strategy.Eat.eatMeat;
import Behavioral.Strategy.Eat.eatVeggie;
import Behavioral.Strategy.Fly.NormalFly;
import Behavioral.Strategy.Fly.fly;
import Behavioral.Strategy.Fly.flyLikeJet;
import Behavioral.Strategy.Objects.Duck;
import Behavioral.Strategy.Objects.MountainDuck;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // Creating objects
        fly flyLikeJet = new flyLikeJet();
        fly NormalFly =  new NormalFly();

        eat eatMeat =  new eatMeat();
        eat eatVeggie = new eatVeggie();


        Duck mountainDuck = new MountainDuck(flyLikeJet,eatVeggie);


        mountainDuck.eatPlease();
        mountainDuck.performfly();

    }
}