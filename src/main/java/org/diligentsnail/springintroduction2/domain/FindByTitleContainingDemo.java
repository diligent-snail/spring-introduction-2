package org.diligentsnail.springintroduction2.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FindByTitleContainingDemo implements ApplicationRunner {
    private final SongRepository songRepository;

    public FindByTitleContainingDemo(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        songRepository.findByTitleContaining("One")
                .forEach(System.out::println);
    }
}
