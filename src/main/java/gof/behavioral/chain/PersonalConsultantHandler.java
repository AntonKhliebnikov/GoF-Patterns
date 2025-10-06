package gof.behavioral.chain;

public class PersonalConsultantHandler implements CreditRequestHandler {
    private CreditRequestHandler next;

    @Override
    public void handleRequest(CreditRequest request) {
        if (request.getType().equals(CreditType.PERSONAL)) {
            System.out.println("Кредит оформляет персональный консультант");
        }

        if (next != null) {
            next.handleRequest(request);
        }
    }

    @Override
    public void setNext(CreditRequestHandler next) {
        this.next = next;
    }
}
