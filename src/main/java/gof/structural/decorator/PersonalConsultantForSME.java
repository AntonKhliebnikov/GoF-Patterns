package gof.structural.decorator;

public class PersonalConsultantForSME extends BankServiceDecorator{

    public PersonalConsultantForSME(BankService service) {
        super(service);
    }

    public String consultingForSME() {
        return "Консультирование клиентов малого и среднего бизнеса";
    }

    @Override
    public String consulting() {
        return super.consulting() + ", " + consultingForSME();
    }
}