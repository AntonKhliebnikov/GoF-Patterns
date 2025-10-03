package gof.structural.facade;

public class Client {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.issueLoan();
    }
}
