package Behavioral.Command;

public class steakCommand implements Command{
    Chef chef;

    public steakCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookSteak();
    }
}
