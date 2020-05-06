package game.project.lib_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<MainActivity.MovieViewHolder> {
    private List <Movie> movies;
    private LayoutInflater layout; // расположение елементов
    private Context context; // для получения доступа к ресурсам приложения
    public Adapter(Context context) {
//        super();
        this.context = context;
        this.layout = LayoutInflater.from(context);
//        this.movies = new ArrayList<>();
    }

    @NonNull
    @Override
    // создает елемент View, метод возвращает 1 объект класса Movie, метод позволяет связать данные View с конкретной позицией в разметке:
    public MainActivity.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.row_movie, parent, false); // в разметку row_movie будет загружаться изображение
        MainActivity.MovieViewHolder holder = new MainActivity.MovieViewHolder(view); // сязываем елемент holder с елементов view
        return holder;
    }

    // метод для связи елемента viewholder с конкретной позицией конкретного елемента:
    @Override
    public void onBindViewHolder(@NonNull MainActivity.MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
        Picasso.with(context)
                .load(movie.getPoster())
                .placeholder(R.color.colorAccent)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return(movies==null) ? 0: movies.size(); // если лист пустой, то получем количество елементов 0 или получаем количество загруженных елементов
    }

    // загрузить данные в лист:
    public void setMovieList(List<Movie> listmovie) {
        this.movies = new ArrayList<>();
        this.movies.addAll(movies); // добавить все данные
        notifyDataSetChanged(); // подтверить сделанные изменения
    }
}
