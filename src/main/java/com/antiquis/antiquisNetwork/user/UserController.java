package com.antiquis.antiquisNetwork.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/Hi")
    public String sayHi() {
        String greeting = "hi";
        return greeting;
    }
}

