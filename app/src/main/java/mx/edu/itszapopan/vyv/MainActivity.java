package mx.edu.itszapopan.vyv;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

import mx.edu.itszapopan.vyv.data.Pregunta;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    CountDownTimer cdt;
    ArrayList<Pregunta> p;
    Random obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int rep = 0;
        pb = (ProgressBar) findViewById(R.id.progressBar);
        p = Pregunta.getPreguntas();
        updateLayout();

        final int[] i = {0,0};
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
                updateLayout();
                this.start();
                i[1]++;
            }
        };
        cdt.start();

    }

    private void updateLayout() {
        obj = new Random();
        int size = p.size();
        int pos = obj.nextInt(size);
        int ca = obj.nextInt(3);
        Pregunta temp = p.get(pos);

        TextView preg = (TextView) findViewById(R.id.textView2);
        TextView res1 = (TextView) findViewById(R.id.textView3);
        TextView res2 = (TextView) findViewById(R.id.textView4);
        TextView res3 = (TextView) findViewById(R.id.textView5);

        preg.setText(temp.getPregunta());

        switch (ca) {
            case 0:
                res1.setText(temp.getCa());
                res2.setText(temp.getWa1());
                res3.setText(temp.getWa2());
                break;

            case 1:
                res1.setText(temp.getWa1());
                res2.setText(temp.getCa());
                res3.setText(temp.getWa2());
                break;

            case 2:
                res1.setText(temp.getWa1());
                res2.setText(temp.getWa2());
                res3.setText(temp.getCa());
                break;
        }
    }
}
