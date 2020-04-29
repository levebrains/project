package game.project.lib_project;

public class Movie {
    private String title;
    private String poster;
    private String description;
    private String background;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
// return "http://image.tmdb.org/t/p/w500" + poster;
//return "http://t2.gstatic.com/images?q=tbn:" + poster;
        return "http://t2.gstatic.com/images?q=tbn:ANd9GcQW3LbpT94mtUG1PZIIzJNxmFX399wr_NcvoppJ82k7z99Hx6in";
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackdrop() {
        return "http://image.tmdb.org/t/p/w500" + background;
    }

    public void setBackdrop(String backdrop) {
        this.background = backdrop;
    }
}

