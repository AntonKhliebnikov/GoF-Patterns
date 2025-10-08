package gof.behavioral.mediator;

public interface Bank {
    void notify(BankDepartment department, Event event);
}

