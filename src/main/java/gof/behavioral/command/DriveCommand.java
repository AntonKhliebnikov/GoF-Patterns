package gof.behavioral.command;

public class DriveCommand implements Command {
    private final Car car;

    public DriveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.drive();
    }
}