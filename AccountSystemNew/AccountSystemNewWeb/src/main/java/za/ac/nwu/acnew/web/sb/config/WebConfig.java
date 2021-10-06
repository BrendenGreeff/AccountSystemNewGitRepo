package za.ac.nwu.acnew.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.acnew.logic.config.LogicConfig;

@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.acnew.web.sb.controller", "za.ac.nwu.acnew.web.sb.exception"})
public class WebConfig {
}
