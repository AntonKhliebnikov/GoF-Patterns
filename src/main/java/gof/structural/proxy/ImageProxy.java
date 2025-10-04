package gof.structural.proxy;

public class ImageProxy implements Image {
    private final String url;
    private RealImage realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.display();
    }
}