package Behavioral.Command;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Command pastaCommand =  new pastaCommand(chef);
        Command steakCommand =  new steakCommand(chef);

        pastaCommand.execute();
        steakCommand.execute();

    }
}
