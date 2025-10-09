package gof.behavioral.memento;

public class UserProfileSettings {
    private String name;
    private int age;
    private String city;

    public void setSettings(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public UserProfileMemento saveSettings() {
        return new UserProfileMemento(name, age, city);
    }

    public void restoreSettings(UserProfileMemento memento) {
        this.name = memento.name;
        this.age = memento.age;
        this.city = memento.city;
    }

    @Override
    public String toString() {
        return "UserProfileSettings{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    static class UserProfileMemento {
        private final String name;
        private final int age;
        private final String city;

        public UserProfileMemento(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }
}