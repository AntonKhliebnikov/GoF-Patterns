package gof.behavioral.chain;

public class Client {
    public static void main(String[] args) {
        CreditRequestHandler personalConsultant = new PersonalConsultantHandler();
        CreditRequestHandler consultantForSme = new ConsultantForSmeHandler();

        personalConsultant.setNext(consultantForSme);

        CreditRequest personalCredit = new CreditRequest(CreditType.PERSONAL);
        CreditRequest businessCredit = new CreditRequest(CreditType.BUSINESS);

        personalConsultant.handleRequest(personalCredit);
        personalConsultant.handleRequest(personalCredit);
        personalConsultant.handleRequest(businessCredit);

        consultantForSme.handleRequest(businessCredit);

    }
}
