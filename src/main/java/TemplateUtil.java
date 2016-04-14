import sun.reflect.generics.repository.ClassRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by tmp on 14.04.2016.
 */
public class TemplateUtil {

    static {
        Properties properties = new Properties();
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER,"class");
        properties.setProperty("class.resource.loader.class", ClasspathResourceLoader.class.getName());
        Velocity.init(properties);
    }

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","Я");
        Writer writer = new PrintWriter (System.out, true);
        Velocity.mergeTemplate("")
    }
}
