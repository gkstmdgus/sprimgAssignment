package springSA;

public class Bus{
    private int oilAmount;
    private final int maxPassenger;
    private boolean isRunning;
    private int fee;
    private static int checkBusNumber = 1;
    private final int busNumber;
    private int nowPassenger;
    private int nowVelocity;

    public void setOilAmount(int oilAmount) {
        this.oilAmount = oilAmount;
    }

    public int getOilAmount() {
        return oilAmount;
    }

    public int getFee() {
        return fee;
    }

    private final int maxVelocity = 100;

    BusState busState = new BusState();

    public Bus() {
        this.busNumber = checkBusNumber++;
        this.nowPassenger = 0;
        this.nowVelocity = 0;
        this.oilAmount = 100;
        this.maxPassenger = 50;
        this.fee = 1000;
        this.isRunning = true;
        System.out.println("버스를 가동합니다. 버스 번호 : " + busNumber);
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void changeRunning(){
        if(!isRunning) runBus();
        else stopBus();
    }

    void runBus() {
        System.out.println("상태 = 운행");
        isRunning = true;
    }

    void stopBus() {
        System.out.println("상태 = 차고지행");
        isRunning = false;
    }

    void addPassenger(int addPassengerNumber) {
        nowPassenger = busState.checkAddPassenger(addPassengerNumber, nowPassenger);
    }

    void changeVelocity(int velocity) {
        nowVelocity = busState.checkVelocity(velocity, nowVelocity);
    }

    void addOil(int oil) {
        busState.checkOilState(oil);
    }
}