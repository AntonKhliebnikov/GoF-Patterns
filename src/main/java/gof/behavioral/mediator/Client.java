package gof.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        CreditDepartment creditDepartment = new CreditDepartment(consultant);
        CardDepartment cardDepartment = new CardDepartment(consultant);
        consultant.setCreditDepartment(creditDepartment);
        consultant.setCardDepartment(cardDepartment);

        consultant.notify(creditDepartment, Event.LOAN_APPLY);
        consultant.notify(cardDepartment, Event.CARD_ORDER);
    }
}
