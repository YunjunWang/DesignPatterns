import Abstraction.MailService;
import Class.User;
import Command.Demo.App.AddCustomerCommand;
import Command.Demo.App.CustomerService;
import Command.Demo.Composite.BlackAndWhiteFilterCommand;
import Command.Demo.Composite.CompositeCommand;
import Command.Demo.Composite.ResizeCommand;
import Command.Demo.FX.Button;
import Command.Demo.FX.Command;
import Command.Demo.undo.BoldCommand;
import Command.Demo.undo.CommandHistory;
import Command.Demo.undo.HTMLDocument;
import Command.Demo.undo.UndoCommand;
import Encapsulation.Account;
import Interface.TaxCalculator;
import Interface.TaxCalculator2019;
import Iterator.Iterator;
import Iterator.Demo.BrowseHistory;
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
import Strategy.Demo.BlackAndWhiteFilter;
import Strategy.Demo.GifCompressor;
import Strategy.Demo.ImageStorage;
import Strategy.Demo.JpegCompressor;
import Strategy.Exercise.AesEncryption;
import Strategy.Exercise.ChatClient;
import Strategy.Exercise.DesEncryption;
import Strategy.Exercise.UnsupportedEncryption;
import TemplateMethod.Demo.GenerateReportTask;
import TemplateMethod.Demo.TransferMoneyTask;

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
        strategyPatter();
        templateMethodPattern();
        commandPattern();
    }


    public static void commandPattern() {
        System.out.println("\n__________Command Pattern__________");
        CustomerService customerService = new CustomerService();
        Command addCustomerCmd = new AddCustomerCommand(customerService);
        Button btn = new Button(addCustomerCmd);
        btn.click();

        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteFilterCommand());
        compositeCommand.execute();


        HTMLDocument document = new HTMLDocument();
        CommandHistory history = new CommandHistory();
        BoldCommand boldCommand = new BoldCommand(document, history);
        document.setContent("Hello World!");
        boldCommand.execute();
        System.out.println(document.getContent());

//        boldCommand.unexecute();
//        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }

    public static void templateMethodPattern() {
        System.out.println("\n__________Template Method Pattern__________");
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();

    }

    public static void strategyPatter() {
        System.out.println("\n__________Strategy Pattern__________");
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new GifCompressor(), new BlackAndWhiteFilter());

        ChatClient chatClient = new ChatClient();
        chatClient.send("message", new DesEncryption());
        chatClient.send("message", new AesEncryption());
        try {
            chatClient.send("message", new UnsupportedEncryption());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void iteratorPattern() {
        System.out.println("\n__________Iterator Pattern__________");
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

//        for(int i = 0; i < browseHistory.getUrls().size(); i++) {
//            String url = browseHistory.getUrls().get(i);
//            System.out.println(url);
//        }
        Iterator iterator = browseHistory.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
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
