package game.project.clicklesson;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount = 0;
    private TextView helloTextView;
    private Button mCatsCounterButton;
    private int mCount2 = 0;
    private TextView catsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloTextView = findViewById(R.id.textView);
        mCrowsCounterButton = findViewById(R.id.button2);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloTextView.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
        catsTextView = findViewById(R.id.textView);
        mCatsCounterButton = findViewById(R.id.button3);
        mCatsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catsTextView.setText ("Я насчитал " + ++mCount2 + " котов");
            }
        });


    }

    public void onclick(View view) {
        helloTextView.setText("Привет, мама!!!");
    }
    }
