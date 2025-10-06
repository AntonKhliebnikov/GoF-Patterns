package gof.behavioral.chain;

public interface CreditRequestHandler {
    void handleRequest(CreditRequest request);
    void setNext(CreditRequestHandler next);
}
