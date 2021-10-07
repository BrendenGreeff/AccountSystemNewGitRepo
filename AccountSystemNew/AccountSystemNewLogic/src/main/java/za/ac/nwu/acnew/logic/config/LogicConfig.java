package za.ac.nwu.acnew.logic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.acnew.translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.acnew.logic.flow",
        "za.ac.nwu.acnew.translator.impl"
        /*"za.ac.nwu.acnew.web.sb.controller",
        "za.ac.nwu.acnew.web.sb.exception"*/
})
public class LogicConfig {
}
