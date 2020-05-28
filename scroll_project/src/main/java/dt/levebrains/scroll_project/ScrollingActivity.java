package dt.levebrains.scroll_project;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ScrollingActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory {

    private ImageSwitcher imageSwitcher;
    int position = 0;
    private int [] images = {R.drawable.animation4, R.drawable.animation5}; // создание массива изображений
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        imageSwitcher = (ImageSwitcher)findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(this);
        Animation animation = new AlphaAnimation(0,1); // затемнение изображение
        animation.setDuration(2000); // продолжительность
        imageSwitcher.setImageResource(images[0]); // указываем, откуда брать изображение, начиная с нулевого елемента
        imageSwitcher.setInAnimation(animation);
    }

    @Override
    public View makeView() {
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        imageView.setBackgroundColor(0xFF000000);
        return imageView;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonForward:
                setPositionNext();
                imageSwitcher.setImageResource(images[position]);
                break;
                case R.id.buttonPrev:
            setPositionPrev();
            imageSwitcher.setImageResource(images[position]);
            break;

        }
    }

    private void setPositionPrev() {
        position--; // уменьшаем счетчик
        if (position < 0) {
            position = images.length -1;
        }
    }

    private void setPositionNext() {
        // увеличивает счетчик
        position++;
        if(position>images.length - 1) {
            position =0;
        }
    }
}
