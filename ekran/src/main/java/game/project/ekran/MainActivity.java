package game.project.ekran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText userEditText = (EditText)findViewById(R.id.editText1);
        EditText giftEditText = (EditText)findViewById(R.id.editText2);
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);

        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);

    }

}
