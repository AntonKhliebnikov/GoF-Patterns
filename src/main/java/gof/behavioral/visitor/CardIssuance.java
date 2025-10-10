package gof.behavioral.visitor;

public class CardIssuance implements BankingService {
    @Override
    public void accept(Clients visitor) {
        visitor.visitCardIssuance(this);
    }

    public String issueNewCard() {
        return "Выпуск новой карты: ";
    }
}