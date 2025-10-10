package gof.behavioral.visitor;

public interface BankingService {
    void accept(Clients visitor);
}