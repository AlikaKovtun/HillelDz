package hilleldz.dz11;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setNumber(1);
        ac1.setCustomerName("George Russel");
        ac1.setCustomerEmailAddress("GeorgeRussel@gmail.com");
        ac1.setCustomerPhoneNumber(444567554);

        Account ac2 = new Account();
        ac2.setNumber(2);
        ac2.setCustomerName("Lando Norris");
        ac2.setCustomerEmailAddress("LandoNorris@gmail.com");
        ac2.setCustomerPhoneNumber(904758493);

        ac1.deposit(1000);
        ac1.withdrawal(346.30);
        ac1.showBalance();

        System.out.println();

        ac2.deposit(200);
        ac2.withdrawal(500);
        ac2.showBalance();
        System.out.println();

        System.out.println("Старый эмейл адрес " + ac1.getCustomerName() + ": " + ac1.getCustomerEmailAddress());
        ac1.setCustomerEmailAddress("FutureMercDriver@gmail.com");
        System.out.println("Новый эмейл адрес " + ac1.getCustomerName() + ": " + ac1.getCustomerEmailAddress());
    }
}
