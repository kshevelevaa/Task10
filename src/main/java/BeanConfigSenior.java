import org.springframework.context.annotation.Bean;

public class BeanConfigSenior {
    @Bean
    public Programmer programmer() {
        return new Senior() {
        };
    }
}
