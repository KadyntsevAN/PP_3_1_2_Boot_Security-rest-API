package ru.kata.PP_3_1_2_Boot_SecurityrestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pp312BootSecurityRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(Pp312BootSecurityRestApiApplication.class, args);
        String c = UserClient.getCookie();
        UserClient.saveUser(c);
        UserClient.editUser(c);
        UserClient.deleteUser(c);
    }
}
