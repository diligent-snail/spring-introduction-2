package org.diligentsnail.springintroduction2.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Builder
@Getter
@ToString
public class Song {
    @Id
    private Long id;
    private String title;
    private String artist;
}
