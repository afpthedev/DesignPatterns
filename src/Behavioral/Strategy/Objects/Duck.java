package Behavioral.Strategy.Objects;

import Behavioral.Strategy.Eat.eat;
import Behavioral.Strategy.Fly.fly;

public class Duck {

    protected fly flySomeWhere;
    protected eat eatSomeThing;

    public Duck(fly fly, eat eat) {
        this.flySomeWhere = fly;
        this.eatSomeThing = eat;
    }
    // Fly method in use
    public void performfly(){
        flySomeWhere.fly();
    }
    // eat method
    public void eatPlease(){
        eatSomeThing.eatSomething();
    }



}
