package gof.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        DriveCommand driveCommand = new DriveCommand(car);
        StopCommand stopCommand = new StopCommand(car);

        Driver driver = new Driver(driveCommand, stopCommand);

        driver.startEngine();
        driver.stopEngine();
    }
}
