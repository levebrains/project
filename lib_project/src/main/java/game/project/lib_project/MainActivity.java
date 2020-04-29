package game.project.lib_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RetrofitApi retrofitApi;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new Adapter(this);
        recyclerView.setAdapter(adapter);
        getmovie();
    }
    private void getmovie () {
        MoviesApiServices moviesApiService=retrofitApi.getClient().create(MoviesApiServices.class);
        Call<ResponceModel> call = moviesApiService.getPopularMovies("eb37bafc5fe27ad9ab86a74e72812c06"); // ключ доступа к серверу
        call.enqueue(new Callback<ResponceModel>() {
            @Override
            public void onResponse(Call<ResponceModel> call, Response<ResponceModel> response) {
                List<Movie> listmovie = new ArrayList<>();
                listmovie.addAll(response.body().getResult());
                adapter.setMovieList(listmovie);
            } // возвращает ответ сервера

            @Override
            public void onFailure(Call<ResponceModel> call, Throwable t) {

            } // ответ в случае неудачной попытки
        });
    }
}
