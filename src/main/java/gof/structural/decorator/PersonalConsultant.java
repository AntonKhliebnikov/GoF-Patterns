package gof.structural.decorator;

public class PersonalConsultant extends BankServiceDecorator {

    public PersonalConsultant(BankService service) {
        super(service);
    }

    public String consultingPremiumClients() {
        return "Консультирование премиальных клиентов";
    }

    @Override
    public String consulting() {
        return super.consulting() + ", " + consultingPremiumClients();
    }
}