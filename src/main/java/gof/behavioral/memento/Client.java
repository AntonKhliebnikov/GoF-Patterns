package gof.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        UserProfileSettings profile = new UserProfileSettings();
        UserProfileHistory history = new UserProfileHistory();

        profile.setSettings("Luka", 27, "Dallas");
        System.out.println(profile);

        history.save(profile.saveSettings());

        profile.setSettings("Luka", 27, "LA");
        System.out.println(profile);

        profile.restoreSettings(history.restore());
        System.out.println(profile);
    }
}