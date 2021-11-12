package template_method.demo;

public class GenerateReportTask extends Task{

    @Override
    protected void doExecute() {
        System.out.println("Generate report...");
    }
}
