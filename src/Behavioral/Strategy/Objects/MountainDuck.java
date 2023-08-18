package Behavioral.Strategy.Objects;

import Behavioral.Strategy.Eat.eat;
import Behavioral.Strategy.Fly.fly;

public class MountainDuck extends Duck
{
    public void fly() {
        flySomeWhere.fly();
    }

    public void eatSomething() {
        eatSomeThing.eatSomething();
    }

    public MountainDuck(fly fly, eat eat) {
        super(fly, eat);
    }
}
