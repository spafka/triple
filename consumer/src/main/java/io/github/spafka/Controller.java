package io.github.spafka;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class Controller {

    @Reference
    EchoService echoService;
    @GetMapping
    public String toString() {
        String echo = echoService.echo("");
        return super.toString();
    }
}
