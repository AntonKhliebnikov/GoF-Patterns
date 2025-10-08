package gof.behavioral.mediator;

public class CardDepartment implements BankDepartment {
    private final Bank bank;

    public CardDepartment(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void doJob() {
        System.out.println("Идет процесс выпуска карты...");
        bank.notify(this, Event.CARD_ISSUED);
    }
}