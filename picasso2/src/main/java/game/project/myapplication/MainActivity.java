package game.project.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = (ImageView) findViewById(R.id.image);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { showImageUsingPicasso();
            }
        });
    }

    private void showImageUsingPicasso() {
        Picasso.with(MainActivity.this)
                .load("https://androidjson.com/wp-content/uploads/2016/12/sample_image.png")
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .resize(300, 300)
                .into(imageview);


    }

}