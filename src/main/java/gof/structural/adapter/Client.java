package gof.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Lending bankLending = new Bank(new ConstructionCompany());
        bankLending.businessLending();
    }
}
