package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.HitProgramRepository;
import repository.ProposalProgramRepository;
import repository.impls.HitProgramRepositoryImpl;
import repository.impls.ProposalProgramRepositoryImpl;

@Configuration
public class AppConfig {
    @Bean
    public HitProgramRepository radioProgramService() {
        return new HitProgramRepositoryImpl();
    }
    @Bean
    public ProposalProgramRepository proposalProgramRepository() {
        return new ProposalProgramRepositoryImpl();
    }

}
