package hilleldz.dz16;

public class Ticket {

    private int sitNumber;
    private FlightInfo flightInfo;
    private Passenger passenger;

    public Ticket(int sitNumber, FlightInfo flightInfo, Passenger passenger) {
        this.sitNumber = sitNumber;
        this.flightInfo = flightInfo;
        this.passenger = passenger;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public int getCost() {
        return flightInfo.getCost();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "sitNumber=" + sitNumber +
                ", flightInfo=" + flightInfo +
                ", passenger=" + passenger +
                ", ticket price= " + getCost() + "$" +
                '}';
    }
}
