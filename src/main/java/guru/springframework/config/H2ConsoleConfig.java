package guru.springframework.config;

import org.apache.catalina.servlets.WebdavServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2ConsoleConfig {

    @Bean
    public ServletRegistrationBean h2Console(){
        String path = "/h2-console";
        String urlMapping = (path.endsWith("/") ? path + "*" : path + "/*");
        return new ServletRegistrationBean(new WebdavServlet(), urlMapping);
    }
}
