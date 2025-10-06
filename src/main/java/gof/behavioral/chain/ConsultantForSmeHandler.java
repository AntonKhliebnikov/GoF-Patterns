package gof.behavioral.chain;

public class ConsultantForSmeHandler implements CreditRequestHandler {
    private CreditRequestHandler next;

    @Override
    public void handleRequest(CreditRequest request) {
        if (request.getType().equals(CreditType.BUSINESS)) {
            System.out.println("Кредит оформляет консультант по СМБ");
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
