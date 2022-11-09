package jp.hashitaro.sample.aws.ecs.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("jp.hashitaro.sample.aws.ecs.backend.app.web")
public class MvcConfig implements WebMvcConfigurer {
}
