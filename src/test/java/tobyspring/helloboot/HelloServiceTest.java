package tobyspring.helloboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloServiceTest {

    @Test
    void helloService () {
        final SimpleHelloService helloService = new SimpleHelloService();

        final String ret = helloService.sayHello("test");
        assertThat(ret).isEqualTo("Hello test");
    }

    @Test
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        final String ret = decorator.sayHello("TEST");

        assertThat(ret).isEqualTo("*TEST*");
    }

}