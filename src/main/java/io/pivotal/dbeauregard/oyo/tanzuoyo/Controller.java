package io.pivotal.dbeauregard.oyo.tanzuoyo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String defaultPath() {
        return String.format("Hello %s!\n", "Tanzu Platform");
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!\n", name);
    }

}
