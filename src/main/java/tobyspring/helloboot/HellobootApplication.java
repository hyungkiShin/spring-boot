package tobyspring.helloboot;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;

public class HellobootApplication {

    public static void main(String[] args) {
        // TomcatServletWebServer 를 만드는데 복잡한 생성과정과 복잡한 설정등을 지원하고, 모든 설정을 마친뒤에 tomcatServletWebserver 를 생성해 달라는 요청을 하면, 우아하게 만들어주는 일종의 도우미 클래스
        TomcatServletWebServerFactory serverFactory = new TomcatServletWebServerFactory();

        // servletContainer 를 만드는 함수 ( 이게 진짜 WebServer )
        WebServer webServer = serverFactory.getWebServer();
        webServer.start();
    }

}
