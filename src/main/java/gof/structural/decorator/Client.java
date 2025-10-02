package gof.structural.decorator;

public class Client {
    public static void main(String[] args) {
        BankService service = new PersonalConsultantForSME(new PersonalConsultant(new Consultant()));
        System.out.println(service.consulting());
    }
}
