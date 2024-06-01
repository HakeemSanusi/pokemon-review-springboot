package com.pokemonreview.api.dto;
import java.util.Objects;

public class ReviewDto {
    private int id;
    private String title;
    private String content;
    private int stars;

    public ReviewDto() {
    }

    public ReviewDto(String title, String content, int stars) {
        this.title = title;
        this.content = content;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewDto reviewDto = (ReviewDto) o;
        return id == reviewDto.id && stars == reviewDto.stars && Objects.equals(title, reviewDto.title) && Objects.equals(content, reviewDto.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, content, stars);
    }
}
