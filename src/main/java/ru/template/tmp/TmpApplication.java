package ru.template.tmp;

import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableFeignClients
//@EnableWebSecurity
//@ConfigurationPropertiesScan
//@EnableConfigurationProperties

@SpringBootApplication
public class TmpApplication {

    public static void main(String[] args) {
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        SpringApplication.run(TmpApplication.class, args);
    }

}
