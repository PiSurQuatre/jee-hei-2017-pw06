package hei.tp06.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by pic on 14/02/2017.
 */
@Configuration
@ComponentScan({"hei.tp06.core.service"})
@EnableJpaRepositories
public class AppConfig
{

}
