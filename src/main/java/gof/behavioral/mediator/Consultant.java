package gof.behavioral.mediator;

public class Consultant implements Bank {
    private CreditDepartment creditDepartment;
    private CardDepartment cardDepartment;

    public void setCreditDepartment(CreditDepartment creditDepartment) {
        this.creditDepartment = creditDepartment;
    }

    public void setCardDepartment(CardDepartment cardDepartment) {
        this.cardDepartment = cardDepartment;
    }

    @Override
    public void notify(BankDepartment department, Event event) {
        switch (event){
            case LOAN_APPLY -> {
                System.out.println("Создана заявка на рассмотрение кредита!");
                department.doJob();
            }
            case LOAN_DECIDED -> System.out.println("Кредит одобрен!");

            case CARD_ORDER -> {
                System.out.println("Создана заявка на выпуск карты!");
                department.doJob();
            }
            case CARD_ISSUED -> System.out.println("Карта выпущена на имя клиента!");
        }

    }
}