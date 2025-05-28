package SystemFiles;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties nicht gefunden!");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Fehler beim Laden der Konfiguration", e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

}
