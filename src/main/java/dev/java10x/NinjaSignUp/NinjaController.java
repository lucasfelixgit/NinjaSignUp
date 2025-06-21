package dev.java10x.NinjaSignUp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/greetings")
    public String greetings() {
        return "This is my first message in this route!";
    }

}
