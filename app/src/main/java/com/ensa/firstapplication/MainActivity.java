package com.ensa.firstapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nom,email,phone,adresse;
    private Button send;
    private Spinner villes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        email=findViewById(R.id.adresse);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        send = findViewById(R.id.send);
        villes  =  findViewById(R.id.villes);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("Email", email.getText().toString());
                intent.putExtra("Ville", villes.getSelectedItem().toString());
                intent.putExtra("Phone", phone.getText().toString());
                intent.putExtra("Adrees", adresse.getText().toString());
                startActivity(intent);

                MainActivity.this.finish();
            }
        });
    }
}