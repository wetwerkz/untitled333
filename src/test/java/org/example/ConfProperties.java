package org.example;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfProperties {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {            // Указания пути до файла с данными
            fileInputStream = new FileInputStream("C:\\Users\\Max\\untitled333\\src\\test\\java\\resources\\conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);            // обработка испключений в виде отсутствия пути и файлов в данном пути
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperties(String key) {
        return PROPERTIES.getProperty(key);
    }
}