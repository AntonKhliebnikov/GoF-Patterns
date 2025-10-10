package gof.behavioral.visitor;

public class Company implements Clients {
    @Override
    public void visitLending(Lending lending) {

        System.out.println(lending.loanRequest() + "Коммерческий кредит");
    }

    @Override
    public void visitCardIssuance(CardIssuance cardIssuance) {

        System.out.println(cardIssuance.issueNewCard() + "Корпоративная карта");
    }
}