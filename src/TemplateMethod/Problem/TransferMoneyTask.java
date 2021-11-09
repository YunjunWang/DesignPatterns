package TemplateMethod.Problem;

import TemplateMethod.AuditTrail;

public class TransferMoneyTask {
    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        this.auditTrail.record();
        System.out.println("Transfer money...");
    }
}
