package javaApplicationsupport;

public class Task2Analysis {

    /*
    1. Cause:
    ConcurrentModificationException occurs when a collection
    is modified while iterating using an iterator.

    2. Problem Code:
    for (Transaction t : list) {
        list.remove(t);
    }

    3. Fix:
    Use Iterator:
    Iterator<Transaction> it = list.iterator();
    while (it.hasNext()) {
        Transaction t = it.next();
        if (condition) {
            it.remove();
        }
    }
    */
}