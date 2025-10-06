package gof.behavioral.chain;

public class CreditRequest {
    private final CreditType type;

    public CreditRequest(CreditType creditType) {
        this.type = creditType;
    }

    public CreditType getType() {
        return type;
    }
}

