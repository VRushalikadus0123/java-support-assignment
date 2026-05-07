package javaApplicationsupport;
import java.util.*;

public class MainTest {

    public static void main(String[] args) throws Exception {

        // Task1 test
        Task1 t1 = new Task1();

        List<LoanAccount> accounts = new ArrayList<>();

        LoanAccount a1 = new LoanAccount();
        a1.setDueDate(new Date(System.currentTimeMillis() - 100000));
        a1.setOutstandingBalance(100);

        accounts.add(a1);

        System.out.println("Overdue Loans: " + t1.getOverdueLoans(accounts).size());

        // Task3 test
        Task3.BankStatementBatchProcessor processor =
                new Task3.BankStatementBatchProcessor();

        List<StatementRecord> records = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            records.add(new StatementRecord());
        }

        processor.process(records);

        System.out.println("Processed Count: " + processor.getProcessedCount());

        // Task5 test
        Exceptionhandler t5 = new Exceptionhandler();

        ValidationResult result = t5.validate(new Document());

        System.out.println("Validation Result: " + result.isValid());
    }
}