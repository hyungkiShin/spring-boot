package tobyspring.helloboot;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("/hello")
@RestController
public class HelloController {

    private final HelloService helloService;
    private final ApplicationContext applicationContext;

    public HelloController(final HelloService helloService, final ApplicationContext applicationContext) {
        this.helloService = helloService;
        this.applicationContext = applicationContext;
    }

    @GetMapping
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
