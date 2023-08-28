package cn.cychee.facade.pagemaker;

import java.io.FileInputStream;
import java.util.Properties;

public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
