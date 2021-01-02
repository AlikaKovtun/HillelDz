package hilleldz.dz16;

public class TicketRunner {

    public static void main(String[] args) {

        Passenger pasNorris = new Passenger("Lando", "Norris", 45326);
        Passenger pasSainz = new Passenger("Carlos", "Sainz", 89647);

        FlightInfo MadridLondon = new FlightInfo(768, "Madrid", "London", 18.10, 300);

        Ticket ticket1 = new Ticket(4, MadridLondon, pasNorris);
        Ticket ticket2 = new VipTicket(55, MadridLondon, pasSainz, new Meal(Menu.MEAT, Drinks.NO), new Baggage(1, 15));

        System.out.println(ticket1 + "\n" + "Полная стоимость билета: " + ticket1.getCost());
        System.out.println(ticket2 + "\n" + "Полная стоимость билета: " + ticket2.getCost());
    }
}

