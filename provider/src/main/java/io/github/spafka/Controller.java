package io.github.spafka;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {


    @GetMapping
    public String toString() {
        return super.toString();
    }
}
