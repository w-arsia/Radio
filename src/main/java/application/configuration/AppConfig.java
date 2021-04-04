package application.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import application.repository.HitProgramRepository;
import application.repository.ProposalProgramRepository;
import application.repository.SongRepository;
import application.repository.impls.HitProgramRepositoryImpl;
import application.repository.impls.ProposalProgramRepositoryImpl;
import application.repository.impls.SongAndAlbumRepositoryImpl;

@Configuration
public class AppConfig {
    @Bean
    public HitProgramRepository hitProgramRepository() {
        return new HitProgramRepositoryImpl();
    }
    @Bean
    public ProposalProgramRepository proposalProgramRepository() {
        return new ProposalProgramRepositoryImpl();
    }
    @Bean
    public SongRepository songRepository() {
        return new SongAndAlbumRepositoryImpl();
    }

}
