package gof.structural.proxy;

public class RealImage implements Image{
    private final String url;

    public RealImage(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Загрузка изображения: " + url);
    }

    @Override
    public void display() {
        System.out.println("Вывод изображения на экран: " + url);
    }
}