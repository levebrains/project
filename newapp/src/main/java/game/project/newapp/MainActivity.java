package game.project.newapp;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    VideoView player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (VideoView) findViewById(R.id.videoPlayer);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        player.setVideoURI(uri);
        MediaController controller = new MediaController(this);
        player.setMediaController(controller);
        controller.setMediaPlayer(player);
    }

    public void play(View view) {
        player.start();
    }

    public void pause(View view) {
        player.pause();
    }

    public void stop(View view) {
        player.stopPlayback();
        player.resume();
    }
}