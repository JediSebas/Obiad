package com.example.obiad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public EditText obiad;
    Random rand = new Random();
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obiad = (EditText) findViewById(R.id.obiad);
    }

    public void click(View view) {
        x = rand.nextInt(11);
        switch (x){
            case 0:
                obiad.setText("Kurczak po chińsku");
                break;
            case 1:
                obiad.setText("Makaron z kurą i pomidorami");
                break;
            case 2:
                obiad.setText("Kotlet z pyrami");
                break;
            case 3:
                obiad.setText("Mielone w sosie pomidorowym");
                break;
            case 4:
                obiad.setText("Zupa pomidorowa");
                break;
            case 5:
                obiad.setText("Barszcz");
                break;
            case 6:
                obiad.setText("Krem pieczarkowy");
                break;
            case 7:
                obiad.setText("Kotlet z pieczarkami");
                break;
            case 8:
                obiad.setText("Kluski śląskie");
                break;
            case 9:
                obiad.setText("Kopytka");
                break;
            case 10:
                obiad.setText("Kluski parowane");
                break;
        }
    }
}
