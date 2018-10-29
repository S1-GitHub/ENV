import java.io.IOException;
import java.util.Properties;

public class run {


    public static void main(String[] args) throws IOException {
Properties properties =new Properties();
        properties.load(run.class.getResourceAsStream("/data.properties"));
        String version = properties.getProperty("myenv");
        System.out.print(version);
    }
}
