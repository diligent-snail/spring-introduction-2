package org.diligentsnail.springintroduction2.web;

import lombok.AllArgsConstructor;
import org.diligentsnail.springintroduction2.domain.SongRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class SimpleSongController {
    private final SongRepository songRepository;

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("songs", songRepository.findAll());
        return "songs";
    }
}
