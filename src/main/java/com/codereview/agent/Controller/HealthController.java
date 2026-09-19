package com.codereview.agent.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // testing purpose
    @GetMapping("/api/health")
    public String health(){
        return "API Health is running successfully";
    }
}
