package org.diligentsnail.springintroduction2.web;

import org.diligentsnail.springintroduction2.domain.Song;
import org.diligentsnail.springintroduction2.domain.SongRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/songs")
public class SongRestController {
    private final SongRepository songRepository;

    public SongRestController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    // get, post, delete, patch, put, connect
    @GetMapping("/default")
    public Song getDefaultSong() {
        return Song.builder()
                .title("asdfasdf")
                .title("nm,n,n,")
                .build();
    }

    @PostMapping
    public Song postSong(@RequestBody Song song) {
        songRepository.save(song);
        return song;
    }

}
