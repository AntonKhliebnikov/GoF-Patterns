package gof.structural.adapter;

public class Bank implements Lending {
    private ConstructionCompany company;

    public Bank(ConstructionCompany company) {
        this.company = company;
    }

    @Override
    public void businessLending() {
        company.houseConstruction();
        company.houseSelling();
    }
}
