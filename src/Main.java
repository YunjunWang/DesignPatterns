import MomentoPattern.Document.Document;
import MomentoPattern.Document.History;
import MomentoPattern.Document.Prototype.Caretaker;
import MomentoPattern.Document.Prototype.Originator;

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

        // Abstraction: To reduce complexity by hiding unnecessary implementation
        // details ( by using private methods/attributes )
        // only use public when needed.
        MailService mailService = new MailService();
        mailService.sendMail();

        // Inheritance: A mechanism to reuse code across classes.
        // Check it our more in "Ultimate Java" course
        TextBox textBox = new TextBox();
        textBox.enable();
        // RadioButton
        // DropdownList
        // ...

        // Polymorphism: The ability of an object to take on many forms
        draw(textBox);
        draw(new Checkbox());

        //Momento Pattern
        Originator originator = new Originator();
        Caretaker caretaker =  new Caretaker();

        originator.setContent("content1");
        caretaker.push(originator.createState());
        originator.setContent("content2");
        caretaker.push(originator.createState());
        originator.setContent("content3");
        originator.restoreState(caretaker.pop());
        System.out.println(originator.getContent());


        Document doc = new Document();
        History history = new History();

        doc.setState("content1", "fontName1", "fontSize1");
        history.push(doc.createState());

        doc.setState("content2", "fontName2", "fontSize2");
        history.push(doc.createState());

        doc.setState("content3", "fontName3", "fontSize3");
        doc.restoreContent(history.revertContent());
        System.out.println(doc.getContent());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void draw(UIControl control) {
        control.draw();
    }
}
