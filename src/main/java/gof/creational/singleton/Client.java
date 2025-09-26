package gof.creational.singleton;

public class Client {
    public static void main(String[] args) {
        Database database1 = Database.getInstance();
        database1.connection();
        System.out.println(database1);

        Database database2 = Database.getInstance();
        database2.connection();
        System.out.println(database2);

        if (database1 == database2) {
            System.out.println("Объекты являются одним и тем же экземпляром");
        }
    }
}
