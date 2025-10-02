package gof.structural.decorator;

public class Consultant implements BankService {
    @Override
    public String consulting() {
        return "Консультирование клиентов";
    }
}
