package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.HitProgramRepository;
import repository.ProposalProgramRepository;
import repository.SongRepository;
import repository.impls.HitProgramRepositoryImpl;
import repository.impls.ProposalProgramRepositoryImpl;
import repository.impls.SongAndAlbumRepositoryImpl;

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
