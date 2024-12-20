package org.example.advertisement_system;

import org.example.advertisement_system.controller.AdvertisementAdminController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.example.advertisement_system"}, basePackageClasses = {AdvertisementAdminController.class})
public class AdvertisementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvertisementSystemApplication.class, args);
    }

}
