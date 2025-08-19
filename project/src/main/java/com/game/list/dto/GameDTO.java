package com.game.list.dto;

import com.game.list.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String urlImage;
    private String shortDescription;

    public GameDTO(Game entity){
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        urlImage = entity.getUrlImage();
        shortDescription = entity.getShortDescription();
    }
}
