package application.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {
    @Value("${spring.datasource.username}")
    private String usernameDataBase;
    @Value("${spring.datasource.password}")
    private String passwordDataBase;

    @Bean
    public DataSource postgresDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/radio_program_db");
        dataSource.setUsername(usernameDataBase);
        dataSource.setPassword(passwordDataBase);
        return dataSource;
    }

}
