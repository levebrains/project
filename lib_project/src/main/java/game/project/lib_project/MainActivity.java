package game.project.lib_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*RetrofitApi retrofitApi; // запросы к сайтам */
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView); // отображение данных
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new Adapter(this); // соединяет список с разметкой
        recyclerView.setAdapter(adapter);
        /*getmovie(); */
        List<Movie> movie = new ArrayList<>(); // сипсок, куда вводится результат запроса к серверу
        for (int i = 0; i < 25; i++){
            // ограниечение на количество выводимых фильмов
            movie.add(new Movie());
        }
        adapter.setMovieList(movie);
    }
    /*
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
    } */
    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =(ImageView) itemView.findViewById(R.id.imageView);
        }

    }
}
