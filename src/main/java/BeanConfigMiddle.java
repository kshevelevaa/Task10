import org.springframework.context.annotation.Bean;

public class BeanConfigMiddle {
    @Bean
    public Programmer programmer() {
        return new Middle() {
        };
    }
}
