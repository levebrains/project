package game.project.ekran;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        String user = "ЖЫвотное";
        String gift = "дырку от бублика";

       user = getIntent().getExtras().getString("username");
       gift = getIntent().getExtras().getString("gift");

        TextView infoTextView = (TextView)findViewById(R.id.TextViewNew);
        infoTextView.setText(user + ", вам передали " + gift);
    }
}
