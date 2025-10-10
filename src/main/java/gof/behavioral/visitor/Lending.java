package gof.behavioral.visitor;

public class Lending implements BankingService {
    @Override
    public void accept(Clients visitor) {
        visitor.visitLending(this);
    }

    public String loanRequest() {
        return "Запрос на кредит: ";
    }
}