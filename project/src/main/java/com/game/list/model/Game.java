package com.game.list.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "tab_game")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private int year;
    private String genre;
    private String platforms;
    private double score;
    private String urlImage;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(length = 1000)
    private String longDescription;






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
