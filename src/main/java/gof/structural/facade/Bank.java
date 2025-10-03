package gof.structural.facade;

public class Bank {
    Consultant consultant = new Consultant();
    LendingDepartment lendingDepartment = new LendingDepartment();
    BackOffice backOffice = new BackOffice();

    public void issueLoan() {
        consultant.consulting();
        consultant.startProcess();
        lendingDepartment.decideOnCredit();
        backOffice.transferLoanAmount();
    }
}
