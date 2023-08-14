package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(final HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello(String name) {
        if(name == null || name.trim().length() == 0) throw new IllegalArgumentException("name is null or empty");

        return helloService.sayHello(name);
    }
}
