public class Main {
    public static void main(String[] args) {
        // Class
        User user = new User("Yunjun");
        user.sayHello();

        // Interface: a contract that specifies the capabilities of
        // a class should provide. This provides loosely coupled
        // applications.
        TaxCalculator calculator2019 = getCalculator();
        calculator2019.calculateTax();

        // Encapsulation: Bundling the data and methods that operaton
        // on the data within a unit or a class and hiding the values
        // or state of an object inside the class. So with this, we can
        // create robust applications that prevent our objects from going
        // in an invalid state.
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);

        // Abstraction
        MailService mailService = new MailService();
        mailService.sendMail();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
