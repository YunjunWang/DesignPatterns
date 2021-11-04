import Memento.Exercise.Document;
import Memento.Exercise.History;
import Memento.Demo.Caretaker;
import Memento.Demo.Originator;
import State.Demo.Brush;
import State.Demo.Selection;
import State.exercise.CalculateMap;
import State.exercise.Cycling;
import State.exercise.Driving;

public class Main {
    public static void main(String[] args) {
        // Class
        System.out.println("__________Class__________");
        User user = new User("Yunjun");
        user.sayHello();

        // Interface: a contract that specifies the capabilities of
        // a class should provide. This provides loosely coupled
        // applications.
        System.out.println("__________Interface__________");
        TaxCalculator calculator2019 = getCalculator();
        calculator2019.calculateTax();

        // Encapsulation: Bundling the data and methods that operation
        // on the data within a unit or a class and hiding the values
        // or state of an object inside the class. So with this, we can
        // create robust applications that prevent our objects from going
        // in an invalid state.
        System.out.println("__________Encapsulation__________");
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);

        // Abstraction: To reduce complexity by hiding unnecessary implementation
        // details ( by using private methods/attributes )
        // only use public when needed.
        System.out.println("__________Abstraction__________");
        MailService mailService = new MailService();
        mailService.sendMail();

        // Inheritance: A mechanism to reuse code across classes.
        // Check it our more in "Ultimate Java" course
        System.out.println("__________Inheritance__________");
        TextBox textBox = new TextBox();
        textBox.enable();
        // RadioButton
        // DropdownList
        // ...

        // Polymorphism: The ability of an object to take on many forms
        System.out.println("__________Polymorphism__________");
        draw(textBox);
        draw(new Checkbox());

        //Memento Pattern
        System.out.println("__________Memento Pattern__________");
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

        // State Pattern
        System.out.println("__________State Pattern__________");
        Selection selection = new Selection();
        selection.mouseDown();
        selection.mouseUp();

        Brush brush = new Brush();
        brush.mouseDown();
        brush.mouseUp();

        CalculateMap calculateDriving = new Driving();
        calculateDriving.getEta();
        calculateDriving.getDirection();

        CalculateMap calculateCycling = new Cycling();
        calculateCycling.getEta();
        calculateCycling.getDirection();

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void draw(UIControl control) {
        control.draw();
    }
}
