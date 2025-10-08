package gof.behavioral.mediator;

public class CreditDepartment implements BankDepartment {
    private final Bank bank;

    public CreditDepartment(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void doJob() {
        System.out.println("Идет процесс рассмотрения заявки на кредит...");
        bank.notify(this, Event.LOAN_DECIDED);
    }
}