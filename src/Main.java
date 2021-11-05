import Abstraction.MailService;
import Class.User;
import Encapsulation.Account;
import Interface.TaxCalculator;
import Interface.TaxCalculator2019;
import Iterator.Problem.BrowseHistory;
import Memento.Exercise.Document;
import Memento.Exercise.History;
import Memento.Demo.Caretaker;
import Memento.Demo.Originator;
import InheritancePolymorphism.Checkbox;
import InheritancePolymorphism.TextBox;
import InheritancePolymorphism.UIControl;
import State.Demo.Brush;
import State.Demo.Canvas;
import State.Demo.Selection;
import State.Exercise.*;

public class Main {
    public static void main(String[] args) {
        classEssence();
        interfacePrinciple();
        encapsulationPrinciple();
        abstractionPrinciple();
        inheritancePrinciple();
        polymorphismPrinciple();
        mementoPatter();
        statePattern();
        iteratorPattern();
    }

    public static void iteratorPattern() {
        // Iterator Pattern
        System.out.println("\n__________Iterator Pattern__________");
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        for(int i = 0; i < browseHistory.getUrls().size(); i++) {
            String url = browseHistory.getUrls().get(i);
            System.out.println(url);
        }
    }
    public static void statePattern() {
        System.out.println("\n__________State Pattern__________");
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        Map map = new Map();
        map.setCurrentMethod(new Driving());
        map.getEta();
        map.getDirection();

        map.setCurrentMethod(new Cycling());
        map.getEta();
        map.getDirection();

        map.setCurrentMethod(new Walking());
        map.getEta();
        map.getDirection();
    }
    public static void mementoPatter() {
        //Memento Pattern
        System.out.println("\n__________Memento Pattern__________");
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
    public static void polymorphismPrinciple() {
        // Polymorphism: The ability of an object to take on many forms
        TextBox textBox = new TextBox();
        System.out.println("\n__________Polymorphism__________");
        draw(textBox);
        draw(new Checkbox());
    }
    public static void inheritancePrinciple() {
        // Inheritance: A mechanism to reuse code across classes.
        // Check it our more in "Ultimate Java" course
        System.out.println("\n__________Inheritance__________");
        TextBox textBox = new TextBox();
        textBox.enable();
        // RadioButton
        // DropdownList
        // ...
    }
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
    public static void draw(UIControl control) {
        control.draw();
    }
    public static void abstractionPrinciple() {
        // Abstraction: To reduce complexity by hiding unnecessary implementation
        // details ( by using private methods/attributes )
        // only use public when needed.
        System.out.println("\n__________Abstraction__________");
        MailService mailService = new MailService();
        mailService.sendMail();
    }
    public static void encapsulationPrinciple() {
        // Encapsulation: Bundling the data and methods that operation
        // on the data within a unit or a class and hiding the values
        // or state of an object inside the class. So with this, we can
        // create robust applications that prevent our objects from going
        // in an invalid state.
        System.out.println("\n__________Encapsulation__________");
        Account account = new Account();
        account.deposit(10);
        account.withdraw(5);
    }
    public static void interfacePrinciple() {
        // Interface: a contract that specifies the capabilities of
        // a class should provide. This provides loosely coupled
        // applications.
        System.out.println("\n__________Interface__________");
        TaxCalculator calculator2019 = getCalculator();
        calculator2019.calculateTax();
    }
    public static void classEssence() {
        // Class
        System.out.println("\n__________Class__________");
        User user = new User("Yunjun");
        user.sayHello();
    }
}
