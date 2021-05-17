package br.com.appsorted;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){
        EditText max = findViewById(R.id.et_max);
        TextView texto = findViewById(R.id.number_random);
        String nu = max.getText().toString();

        if (nu != ""){
            int num_max = Integer.parseInt(nu);
            int num = new Random().nextInt(num_max + 1);
            texto.setText("Número sorteado: " + num);
        }else {
            Toast.makeText(this, "Selecione um número máximo", Toast.LENGTH_SHORT).show();
        }

    }
}