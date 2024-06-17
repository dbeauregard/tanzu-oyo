package io.pivotal.dbeauregard.oyo.tanzuoyo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private static Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String defaultPath() {
        log.info("Default GET method called!  Hello Tanzu!");
        return String.format("Hello %s!\n", "Tanzu Platform");
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        log.info("Hello method called with name={}", name);
        return String.format("Hello %s!\n", name);
    }

}
