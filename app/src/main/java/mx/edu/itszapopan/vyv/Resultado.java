package mx.edu.itszapopan.vyv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView tPuntaje;
    double puntaje;
    Button jugarOtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        puntaje = getIntent().getDoubleExtra("puntaje", 0);

        tPuntaje = (TextView) findViewById(R.id.textView6);
        tPuntaje.setText(Double.toString(puntaje));

        jugarOtra = (Button) findViewById(R.id.button2);
        jugarOtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resultado.this, MainActivity.class));
            }
        });
    }
}
