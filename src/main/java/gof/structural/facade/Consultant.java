package gof.structural.facade;

public class Consultant {
    public void consulting() {
        System.out.println("Консультант предоставляет условия по кредитованию для клиента.");
    }

    public void startProcess() {
        System.out.println("Консультант принимает пакет документов и передает в " +
                "кредитный отдел для принятия решения по кредитованию.");
    }
}
