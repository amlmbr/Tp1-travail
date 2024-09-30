package com.ensa.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView nomView, emailView, phoneView, adresseView, villesView;
    private Button retourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        nomView = findViewById(R.id.nom);
        emailView = findViewById(R.id.email);
        phoneView = findViewById(R.id.phone);
        adresseView = findViewById(R.id.adresse);
        villesView = findViewById(R.id.villes);
        retourButton = findViewById(R.id.retour);


        Intent intent = getIntent();
        String nom = intent.getStringExtra("nom");
        String email = intent.getStringExtra("Email");
        String phone = intent.getStringExtra("Phone");
        String adresse = intent.getStringExtra("Adrees");
        String ville = intent.getStringExtra("Ville");


        nomView.setText("Nom : " + nom);
        emailView.setText("Email : " + email);
        phoneView.setText("Phone : " + phone);
        adresseView.setText("Adresse : " + adresse);
        villesView.setText("Ville : " + ville);


        retourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent intent = new Intent( SecondActivity.this,MainActivity.class);


                startActivity(intent);

               SecondActivity.this.finish();
            }
        });
    }
}
