package projects.creppyfm.movierecommendationapp.model;

import java.util.Objects;

public class IMDbStreamProperties {
    private final String title;
    private final String rating;
    private final String genre;
    private final String description;

    public IMDbStreamProperties(String title, String rating, String genre, String description) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IMDbStreamProperties that = (IMDbStreamProperties) obj;
        return title.equals(that.title) && rating.equals(that.rating) &&
                genre.equals(that.genre) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, rating, genre, description);
    }

    @Override
    public String toString() {
        return "LiveStreamProperties{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
