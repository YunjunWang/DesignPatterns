package template_method.problem;

import template_method.AuditTrail;

public class GenerateReportTask {
    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        this.auditTrail.record();
        System.out.println("Generate report...");
    }
}
