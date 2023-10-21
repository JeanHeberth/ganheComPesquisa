package br.com.ganheCom.utils;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class CaptarConfig {
    
    private Properties properties;

    public Properties iniciarPropriedades(){

        properties = new Properties();
        try {
            FileInputStream ip = new FileInputStream("src/test/resources/config/config.properties");
            properties.load(ip);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
}
