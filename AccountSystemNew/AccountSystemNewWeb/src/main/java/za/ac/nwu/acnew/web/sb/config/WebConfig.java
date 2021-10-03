package za.ac.nwu.acnew.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.acnew.web.sb.controller", "za.ac.nwu.acnew.web.sb.exception"})

public class WebConfig {
}
