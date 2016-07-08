package mx.edu.itszapopan.vyv;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int rep = 0;
        pb = (ProgressBar) findViewById(R.id.progressBar);

        //do {
            final int[] i = {0};
            pb.setProgress(i[0]);
            cdt = new CountDownTimer(15000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    i[0] += 7;
                    pb.setProgress(i[0]);
                }

                @Override
                public void onFinish() {
                    i[0] = 100;
                    pb.setProgress(i[0]);
                    i[0] = 0;
                    pb.setProgress(i[0]);
                    this.start();
                }
            };
        cdt.start();
            rep++;
        //} while(rep<15);

    }
}
