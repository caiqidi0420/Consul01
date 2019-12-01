package com.cqd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableScheduling
public class TestConsul01 {
    public static void main(String[] args) {
        SpringApplication.run(TestConsul01.class);
    }
    @RequestMapping("/testHelth")
    public String testHelth(){
        System.out.println("=======testHelth========");
        return "---ok--";
    }
}
