package gof.behavioral.visitor;

public class Individual implements Clients {
    @Override
    public void visitLending(Lending lending) {

        System.out.println(lending.loanRequest() + "Кредит на личные нужды.");
    }

    @Override
    public void visitCardIssuance(CardIssuance cardIssuance) {

        System.out.println(cardIssuance.issueNewCard() + "Зарплатная карта");
    }
}