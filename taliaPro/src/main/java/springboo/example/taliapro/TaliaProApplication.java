package springboo.example.taliapro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TaliaProApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaliaProApplication.class, args);
    }
}
