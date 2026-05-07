package javaApplicationsupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {

    public List<LoanAccount> getOverdueLoans(List<LoanAccount> accounts) {

        // FIX: initialize list
        List<LoanAccount> result = new ArrayList<>();

        // FIX: null check
        if (accounts == null) {
            return result;
        }

        for (LoanAccount account : accounts) {

            // FIX: null safety for account and dueDate
            if (account != null &&
                account.getDueDate() != null &&
                account.getDueDate().before(new Date())) {

                if (account.getOutstandingBalance() > 0) {
                    result.add(account);
                }
            }
        }
        return result;
    }
}