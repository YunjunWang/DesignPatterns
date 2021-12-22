import abstraction.MailService;
import Class.User;
import chainOfResponsibility.exercise.*;
import chainOfResponsibility.problem.*;
import command.demo.app.AddCustomerCommand;
import command.demo.app.CustomerService;
import command.demo.composite.BlackAndWhiteFilterCommand;
import command.demo.composite.CompositeCommand;
import command.demo.composite.ResizeCommand;
import command.demo.exercise.*;
import command.demo.fx.Button;
import command.demo.fx.Command;
import command.demo.undo.BoldCommand;
import command.demo.undo.CommandHistory;
import command.demo.undo.HTMLDocument;
import command.demo.undo.UndoCommand;
import encapsulation.Account;
import Interface.TaxCalculator;
import Interface.TaxCalculator2019;
import iterator.Iterator;
import iterator.demo.BrowseHistory;
import mediator.demo.ArticleDialogBox;
import mediator.demo.observer.ArticleMediator;
import mediator.exercise.SignUp;
import memento.exercise.Document;
import memento.exercise.History;
import memento.demo.Caretaker;
import memento.demo.Originator;
import inheritance_polymorphism.Checkbox;
import inheritance_polymorphism.TextBox;
import inheritance_polymorphism.UIControl;
import observer.demo.Chart;
import observer.demo.DataSource;
import observer.demo.Spreadsheet;
import observer.exercise.StatusBar;
import observer.exercise.Stock;
import observer.exercise.StockListView;
import state.demo.Brush;
import state.demo.Canvas;
import state.demo.Selection;
import state.exercise.*;
import strategy.demo.BlackAndWhiteFilter;
import strategy.demo.GifCompressor;
import strategy.demo.ImageStorage;
import strategy.demo.JpegCompressor;
import strategy.exercise.AesEncryption;
import strategy.exercise.ChatClient;
import strategy.exercise.DesEncryption;
import strategy.exercise.UnsupportedEncryption;
import template_method.demo.GenerateReportTask;
import template_method.demo.TransferMoneyTask;

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
        observerPattern();
        mediatorPattern();
        chainOfResponsibilityPattern();

    }

    public static void chainOfResponsibilityPattern() {
        System.out.println("\n__________Chain of Responsibility Pattern__________");
        // Authenticator -> Logger -> Compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer webServer = new WebServer(authenticator);
        HttpRequest request = new HttpRequest("username", "12345");
        webServer.handle(request);

        System.out.println("\n__________exercise__________");
        File excelFile = new File("text.xsl");
        File numbersFile = new File("text.numbers");
        File quickBooksFile = new File("text.qbw");
        File pdfFile = new File("text.pdf");

//        FileReader fileReader = DataReaderChain.getDataReaderChain();
        var excelReader = new ExcelSheetReader(null);
        var numbersReader = new NumbersSheetReader(excelReader);
        var fileReader = new QuickBooksReader(numbersReader);
        var dataReader = new FileReaderChain(fileReader);
        dataReader.read(numbersFile);
        dataReader.read(excelFile);
        dataReader.read(quickBooksFile);
        dataReader.read(excelFile);
        dataReader.read(pdfFile);

//        fileReader.read(numbersFile);
//        fileReader.read(excelFile);
//        fileReader.read(quickBooksFile);
//        fileReader.read(pdfFile);

    }

    public static void mediatorPattern() {
        System.out.println("\n__________Mediator Pattern__________");
        ArticleDialogBox dialogBox = new ArticleDialogBox();
        dialogBox.simulate();
        System.out.println("\n__________using Observer Pattern__________");
        ArticleMediator articleMediator = new ArticleMediator();
        articleMediator.simulate();
        System.out.println("\n__________exercise__________");
        SignUp signUp = new SignUp();
        signUp.simulate();
    }

    public static void observerPattern() {
        System.out.println("\n__________Observer Pattern__________");
        DataSource dataSource = new DataSource();
        Spreadsheet spreadsheet1 = new Spreadsheet(dataSource);
        Spreadsheet spreadsheet2 = new Spreadsheet(dataSource);
        Chart chart = new Chart(dataSource);
        dataSource.addObserver(spreadsheet1);
        dataSource.addObserver(spreadsheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        Stock stock = new Stock();
        StatusBar statusBar = new StatusBar(stock);
        StockListView stockListView = new StockListView(stock);
        stock.addObserver(statusBar);
        stock.addObserver(stockListView);
        stock.setPrice(1.00F);
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

        VideoEditor videoEditor = new VideoEditor();
        LabelActionHistory actionHistory = new LabelActionHistory();
        LabelCommand labelCommand = new LabelCommand(videoEditor, actionHistory);
        ContrastActionHistory contrastActionHistory = new ContrastActionHistory();
        ContrastCommand contrastCommand = new ContrastCommand(videoEditor, contrastActionHistory);
        labelCommand.execute();
        contrastCommand.execute();
        System.out.println(videoEditor);

        UndoLabelCommand undoLabelCommand = new UndoLabelCommand(actionHistory);
        UndoContrastCommand undoContrastCommand = new UndoContrastCommand(contrastActionHistory);
        undoLabelCommand.execute();
        undoContrastCommand.execute();
        System.out.println(videoEditor);
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
