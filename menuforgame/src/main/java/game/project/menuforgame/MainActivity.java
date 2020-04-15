package game.project.menuforgame;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int settingsHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textStartGame = (TextView) findViewById(R.id.start);

        textStartGame.setTypeface(Typeface.createFromAsset(
                getAssets(), "fonts/Radiant.ttf"));
    }

    private void getSettings() {
        SharedPreferences settings = getSharedPreferences(GameMenuDemoActivity.PREFS_NAME, 0);

        settingsHolder[0] = settings.getBoolean("sound", true);
        settingsHolder[1] = settings.getBoolean("music", true);
        settingsHolder[2] = settings.getBoolean("vibrate", true);
        settingsHolder[3] = settings.getBoolean("graphics", true);

    }

    @Override
    public void onClick(View v) {
   getIntent();

    }
}