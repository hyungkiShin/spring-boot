package tobyspring.helloboot;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 실행 시점
@Target({java.lang.annotation.ElementType.TYPE}) // 타입: 클래스나, 인터페이스
@Component
public @interface MyComponent {
}
