package za.ac.nwu.acnew.translator.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.acnew.repo.config.RepositoryConfig;


@Import({RepositoryConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.acnew.translator"
})
public class TranslatorConfig {

}
