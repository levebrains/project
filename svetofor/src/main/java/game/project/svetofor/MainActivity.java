package game.project.svetofor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(getTaskId());
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonRed:
                        //выполняем необходимое действие
                        break; // вызывается для выхода из блока switch (при вызове дальнейший код не исполняется)
                    case R.id.buttonGreen:
                        //выполняем необходимое действие
                        break;
                    case R.id.buttonYellow:
                        //выполняем необходимое действие
                        break;
                }
            }
            })
    ;}
}
