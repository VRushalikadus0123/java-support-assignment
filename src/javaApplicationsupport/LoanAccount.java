package javaApplicationsupport;
import java.util.Date;

public class LoanAccount {
    private Date dueDate;
    private double outstandingBalance;

    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date d) { this.dueDate = d; }

    public double getOutstandingBalance() { return outstandingBalance; }
    public void setOutstandingBalance(double b) { this.outstandingBalance = b; }
}