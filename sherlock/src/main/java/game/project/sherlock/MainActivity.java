package game.project.sherlock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static final private int CHOOSE_THIEF = 0;

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
        Intent questionIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent date) {
        super.onActivityResult(requestCode, resultCode, date);

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);

        if (requestCode == CHOOSE_THIEF) {
            if (requestCode == RESULT_OK) {
                String thiefname = date.getStringExtra(SecondActivity.THIEF);
                infoTextView.setText(thiefname);
            } else {
                infoTextView.setText("");
            }
        }
    }
}
