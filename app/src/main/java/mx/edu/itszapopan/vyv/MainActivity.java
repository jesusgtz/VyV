package mx.edu.itszapopan.vyv;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import mx.edu.itszapopan.vyv.data.Pregunta;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    CountDownTimer cdt;
    ArrayList<Pregunta> p;
    Random obj;
    double puntaje = 0;
    int[] i = {0,0};
    int totalPreguntas = 15;
    double valorDeRespuesta = 6.67;
    int valorProgressBar = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pb = (ProgressBar) findViewById(R.id.progressBar);
        p = Pregunta.getPreguntas();

        updateLayout();
        pb.setProgress(i[0]);
        cdt = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                i[0] += valorProgressBar;
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
                validar();
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
                res1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        Toast t = Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT);
                        t.setGravity(Gravity.CENTER, 0, 0);
                        t.show();
                        puntaje += valorDeRespuesta;
                        validar();
                    }
                });

                res2.setText(temp.getWa1());
                res2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });

                res3.setText(temp.getWa2());
                res3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });
                break;

            case 1:
                res1.setText(temp.getWa1());
                res1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });

                res2.setText(temp.getCa());
                res2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        Toast t = Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT);
                        t.setGravity(Gravity.CENTER, 0, 0);
                        t.show();
                        puntaje += valorDeRespuesta;
                        validar();
                    }
                });

                res3.setText(temp.getWa2());
                res3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });
                break;

            case 2:
                res1.setText(temp.getWa1());
                res1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });

                res2.setText(temp.getWa2());
                res2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        validar();
                    }
                });

                res3.setText(temp.getCa());
                res3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cdt.cancel();
                        i[0] = 0;
                        pb.setProgress(i[0]);
                        cdt.start();
                        updateLayout();
                        i[1]++;
                        Toast t = Toast.makeText(MainActivity.this, "¡Correcto!", Toast.LENGTH_SHORT);
                        t.setGravity(Gravity.CENTER, 0, 0);
                        t.show();
                        puntaje += valorDeRespuesta;
                        validar();
                    }
                });
                break;
        }
    }

    private void validar() {
        if(i[1] == totalPreguntas) {
            cdt.cancel();
            Intent i = new Intent(MainActivity.this, Resultado.class);
            i.putExtra("puntaje", Math.floor(puntaje));
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
    }
}
