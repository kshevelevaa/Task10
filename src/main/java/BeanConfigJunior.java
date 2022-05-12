import org.springframework.context.annotation.Bean;
public class BeanConfigJunior {
    @Bean
    public Programmer programmer(){
        return new Junior(){};
    }

}
