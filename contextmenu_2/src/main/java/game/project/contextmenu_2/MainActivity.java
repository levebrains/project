package game.project.contextmenu_2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext(); // Получаем доступ ко всем ресурсам приложения
        mTextView = findViewById(R.id.tvx);
        registerForContextMenu(mTextView);
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v,
                                    android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu); // Подключаем файл меню
        menu.setHeaderTitle("Select");// Устанавливаем заголовок меню
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                mTextView.setTextColor(Color.RED);
                Toast.makeText(mContext, "Red Selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, New_activity.class);
                startActivity(intent);
            case R.id.green:
                mTextView.setTextColor(Color.GREEN);
                Toast.makeText(mContext, "Green Selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}