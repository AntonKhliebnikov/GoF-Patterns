package gof.behavioral.visitor;

public class InternetBankingApp {
    public static void main(String[] args) {
        Clients individual = new Individual();
        Clients company = new Company();

        BankingService lending = new Lending();
        lending.accept(individual);
        lending.accept(company);

        BankingService cardIssuance = new CardIssuance();
        cardIssuance.accept(individual);
        cardIssuance.accept(company);
    }
}