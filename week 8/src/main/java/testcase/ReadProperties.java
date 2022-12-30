package testcase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
        prop.load(fis);
        String url = prop.getProperty("url");

	}

}
