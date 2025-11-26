package view;

import model.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager a = ConfigManager.getInstance();
        ConfigManager b = ConfigManager.getInstance();

        System.out.println("a == b ? " + (a == b));

        a.set("version", "1.0.0");
        System.out.println("version (via b): " + b.get("version"));

        System.out.println(a);
    }
}
