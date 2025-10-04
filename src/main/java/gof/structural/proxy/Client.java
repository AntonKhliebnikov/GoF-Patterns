package gof.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("https://images.pexels.com/photos/792381/pexels-photo-792381.jpeg");
        image.display();

        image.display();
    }
}
