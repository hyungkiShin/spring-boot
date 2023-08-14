package tobyspring.helloboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

class HelloApiTest {

    @Test
    void HelloApiTest() {
        // given
        TestRestTemplate restTemplate = new TestRestTemplate(); // 응답 자체를 순수하게 다 가져와서 테스트할때 검증하는 클래스
        // when

        // web 응답의 모든 정보를 가져온다
        ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:8080/hello?name={name}", String.class, "Spring");
        // then
        // header(content-type) 검증
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        // body 검증
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);
        assertThat(res.getBody()).isEqualTo("Hello Spring");
    }

}