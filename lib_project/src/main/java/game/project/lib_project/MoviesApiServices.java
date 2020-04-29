package game.project.lib_project;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesApiServices {
    @GET ("movie/popular")
    Call<ResponceModel> getPopularMovies(@Query("api_key") String api_key);
}
