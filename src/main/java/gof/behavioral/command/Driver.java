package gof.behavioral.command;

public class Driver {
    private final Command driveCommand;
    private final Command stopCommand;

    public Driver(Command driveCommand, Command stopCommand) {
        this.driveCommand = driveCommand;
        this.stopCommand = stopCommand;
    }

    public void startEngine(){
        driveCommand.execute();
    }

    public void stopEngine() {
        stopCommand.execute();
    }
}