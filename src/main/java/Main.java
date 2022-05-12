import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        Map<String, Class> classes = new HashMap<>();

        classes.put("BeanConfigSenior.class", BeanConfigSenior.class);
        classes.put("BeanConfigMiddle.class", BeanConfigMiddle.class);
        classes.put("BeanConfigJunior.class", BeanConfigJunior.class);


        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(classes.get(args[0]));
        Programmer pr1 = applicationContext1.getBean(Programmer.class);
        pr1.doCoding();

    }
}
