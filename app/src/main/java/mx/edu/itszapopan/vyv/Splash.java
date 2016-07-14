package mx.edu.itszapopan.vyv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        int secondsDelayed = 4;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, Intro.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }
}
