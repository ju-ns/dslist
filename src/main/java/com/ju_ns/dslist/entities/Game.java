package com.ju_ns.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(name = "game_year" )
    private Integer year;
    private String genre;
    private String platform;
    private String imUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){}

    public Game(long id,
                String title,
                Integer year,
                String genre,
                String platform,
                String imUrl,
                String shortDescription,
                String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imUrl = imUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
