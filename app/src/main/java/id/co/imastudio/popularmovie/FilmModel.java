package id.co.imastudio.popularmovie;

/**
 * Created by idn on 5/13/2017.
 */

public class FilmModel {

    private String judulFilm;
    private String gambarFilm;
    private String posterFilm;
    private String sinopsisFilm;
    private String ratingFilm;
    private String releaseFilm;

    public String getPosterFilm() {
        return posterFilm;
    }

    public void setPosterFilm(String posterFilm) {
        this.posterFilm = posterFilm;
    }

    public String getSinopsisFilm() {
        return sinopsisFilm;
    }

    public void setSinopsisFilm(String sinopsisFilm) {
        this.sinopsisFilm = sinopsisFilm;
    }

    public String getRatingFilm() {
        return ratingFilm;
    }

    public void setRatingFilm(String ratingFilm) {
        this.ratingFilm = ratingFilm;
    }

    public String getReleaseFilm() {
        return releaseFilm;
    }

    public void setReleaseFilm(String releaseFilm) {
        this.releaseFilm = releaseFilm;
    }

    public FilmModel() {
    }

    //bikin Setter and Getter
    //Alt +Insert > Getter and setter


    public String getJudulFilm() {
        return judulFilm;
    }

    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    public String getGambarFilm() {
        return gambarFilm;
    }

    public void setGambarFilm(String gambarFilm) {
        this.gambarFilm = gambarFilm;
    }
}
