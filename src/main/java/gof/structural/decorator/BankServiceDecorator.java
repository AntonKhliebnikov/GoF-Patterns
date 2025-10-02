package gof.structural.decorator;

public class BankServiceDecorator implements BankService {
    private final BankService service;

    public BankServiceDecorator(BankService service) {
        this.service = service;
    }

    @Override
    public String consulting() {
        return service.consulting();
    }
}