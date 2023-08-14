package tobyspring.helloboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class HelloControllerTest {

    @Test
    void hello() {
        final HelloController helloController = new HelloController(name -> name);
        final String ret = helloController.hello("Test");
        assertThat(ret).isEqualTo("Test");
    }

    @Test
    void failHelloController() {
        final HelloController helloController = new HelloController(name -> name);

        assertThatThrownBy(() -> helloController.hello(null))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> helloController.hello(""))
                .isInstanceOf(IllegalArgumentException.class);

    }

}