public class Main {
    public static void main(String[] args) {
        // class
        User user = new User("Yunjun");
        user.sayHello();

        // interface
        TaxCalculator calculator2019 = getCalculator();
        calculator2019.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
