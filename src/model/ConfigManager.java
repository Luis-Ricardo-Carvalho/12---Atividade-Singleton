package model;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static ConfigManager instance;

    private final Map<String, String> configs;

    private ConfigManager() {
        configs = new HashMap<>();
        configs.put("app.name", "MinhaApp");
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
                    instance = new ConfigManager();
        }
        return instance;
    }

    public void set(String key, String value) {
        configs.put(key, value);
    }

    public String get(String key) {
        return configs.get(key);
    }

    @Override
    public String toString() {
        return "ConfigManager{configs=" + configs + "}";
    }
}
