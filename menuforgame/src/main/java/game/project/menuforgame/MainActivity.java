package game.project.menuforgame;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int settingsHolder;
    private Context context;
    TextView mysettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textStartGame = (TextView) findViewById(R.id.start);
        textStartGame.setTypeface(Typeface.createFromAsset(
                getAssets(), "fonts/Radiant.ttf"));
        context = getApplicationContext();
        mysettings = (TextView) findViewById(R.id.settings);
        registerForContextMenu(mysettings);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        menu.setHeaderTitle("Контекстное меню");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.sound:
                mysettings.setTextColor(Color.GREEN);
                System.out.println("приевет");
                Toast.makeText(context, "Настроить звук", Toast.LENGTH_LONG).show();
                return true;
            case R.id.music:
                System.out.println("приевет");
                Toast toast = Toast.makeText(context, "Второй пункт", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                return true;
            case R.id.vibrate:
                System.out.println("Настройка вибрации");
                return true;
            case R.id.graphics:
                System.out.println("Настройка графики");
                return true;
        }
        return super.onContextItemSelected(item);
    }
}