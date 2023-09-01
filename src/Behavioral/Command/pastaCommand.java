package Behavioral.Command;

public class pastaCommand implements Command{
    Chef chef;

    public pastaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookPasta();
    }

}
