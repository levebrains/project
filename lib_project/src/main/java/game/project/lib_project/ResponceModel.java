package game.project.lib_project;

import com.google.gson.annotations.SerializedName;

import java.util.List;

class ResponceModel {
    @SerializedName("results")
    private List<Movie> results;
    public List<Movie> getResult() {
        return results;
    }
}
