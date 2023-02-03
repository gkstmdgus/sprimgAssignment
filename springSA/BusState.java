package springSA;

public class BusState {
    private int oilAmount;
    private final int maxPassenger;
    private boolean isRunning;
    private int fee;

    public BusState() {
        this.oilAmount = 100;
        this.maxPassenger = 50;
        this.fee = 1000;
        this.isRunning = true;
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

    int checkVelocity(int velocity, int nowVelocity) {
        if(!isRunning)      // 가동 체크
            System.out.println("운행중이 아닙니다.");
        else{
            nowVelocity += velocity;
            System.out.println("속도를 변경합니다. 현재 속도 : " + nowVelocity);
        }
        return nowVelocity;
    }

    int checkAddPassenger(int addPassengerNumber, int nowPassenger) {
        if(!isRunning)
            System.out.println("운행중이 아닙니다.");
        else if(maxPassenger < addPassengerNumber + nowPassenger)
            System.out.println("정원 초과입니다. 정원 : " + maxPassenger + ", 탑승 인원 : " + nowPassenger);
        else{
            nowPassenger += addPassengerNumber;
            System.out.println("탑승 승객 수 : " + addPassengerNumber);
            System.out.println("현재 탑승 인원 : " + nowPassenger);
            System.out.println("요금 : " + fee * addPassengerNumber);
        }
        return nowPassenger;
    }

    void checkOilState(int oil) {
        oilAmount += oil;
        if(oilAmount <= 10){
            System.out.println("기름이 없습니다.");
            stopBus();
        }else {
            System.out.println("현재 기름 : " + oilAmount);
        }
    }
}
