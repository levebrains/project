package game.project.lib_project;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

// класс для отображения загруженных изображений
class MovieViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public MovieViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
