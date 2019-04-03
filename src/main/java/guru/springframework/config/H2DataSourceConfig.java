package guru.springframework.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

}
