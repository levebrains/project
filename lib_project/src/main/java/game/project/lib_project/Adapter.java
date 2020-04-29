package game.project.lib_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<MovieViewHolder> {
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
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setMovieList(List<Movie> listmovie) {
    }
}
