package springSA;

public class Display {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.addPassenger(2);
        bus.addOil(-50);
        bus.changeRunning();
        bus.addOil(10);
        bus.changeRunning();
        bus.addPassenger(45);
        bus.addPassenger(5);
        bus.changeVelocity(20);
        bus.addOil(-55);
        bus.changeVelocity(20);
    }
}
