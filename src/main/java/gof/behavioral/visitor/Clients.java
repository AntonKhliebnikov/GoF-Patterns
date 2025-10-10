package gof.behavioral.visitor;

public interface Clients {
    void visitLending(Lending lending);

    void visitCardIssuance(CardIssuance cardIssuance);
}