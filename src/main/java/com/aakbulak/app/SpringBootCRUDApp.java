package com.aakbulak.app;

import com.aakbulak.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.aakbulak")
public class SpringBootCRUDApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootCRUDApp.class, args);
    }
}
