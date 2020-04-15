package game.project.newlesson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.options) {
            final Toast toast = Toast.makeText(getApplicationContext(),
                "Сообщение!", Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER, 0, 0);}
        if (id==R.id.options2) {
            final Toast toast = Toast.makeText(getApplicationContext(),
                    "Привет!", Toast.LENGTH_SHORT);
            toast.show();
            toast.setGravity(Gravity.CENTER, 0, 0);
        }
        return super.onOptionsItemSelected(item);
    }
}
