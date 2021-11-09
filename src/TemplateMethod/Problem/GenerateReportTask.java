package TemplateMethod.Problem;

import TemplateMethod.AuditTrail;

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
