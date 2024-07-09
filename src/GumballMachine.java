//Ithikorn Ungniyom 6510451131

public class GumballMachine {
    boolean noQuarter = true;
    boolean hasQuarter = false;
    int gumballs;

    public GumballMachine() {
        this.gumballs = 4;
    }

    public void quarter() {
        noQuarter = false;
        hasQuarter = true;
    }

    public void chooseGumball() {
        if (hasQuarter) {
            gumballs -= 1;
            System.out.println("Valiid " + gumballs + " gumballs") ;
            noQuarter = true;
            hasQuarter = false;
        } else {
            System.out.println("Your don't have a quarter");
        }
    }

    public void eject() {
        if (hasQuarter) {
            noQuarter = true;
            hasQuarter = false;
            System.out.println("Your eject quarter");
        } else {
            System.out.println("Can't eject");
        }
    }

    public int getGumballs() {
        return gumballs;
    }

}
