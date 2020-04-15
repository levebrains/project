package game.project.counter;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView mTextViewInfo;
    private int mCounter;

    // это будет именем файла настроек
    public final String APP_PREFERENCES = "mysettimgs";
    public static final String APP_PREFERENCES_COUNTER = "counter";
    private SharedPreferences mSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        mTextViewInfo = (TextView)findViewById(R.id.textViewInfo);
    }

    public void onClick(View view) {
        mTextViewInfo.setText("Я насчитал" + ++mCounter + "ворон");
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mSettings.contains(APP_PREFERENCES_COUNTER)) {
            // Получаем число из настроек
            mCounter = mSettings.getInt(APP_PREFERENCES_COUNTER, 0);
            // Выводим на экран данные из настроек
            mTextViewInfo.setText("Я насчитал "
                    + mCounter + " ворон");
        }
    }
    @Override
    protected void onPause() {
            super.onPause();
            // Запоминаем данные
            SharedPreferences.Editor editor = mSettings.edit();
            editor.putInt(APP_PREFERENCES_COUNTER, mCounter);
            editor.apply();
        }
    }