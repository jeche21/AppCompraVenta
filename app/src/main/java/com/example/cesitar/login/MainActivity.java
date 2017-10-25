package com.example.cesitar.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnResgitrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnResgitrar = (TextView) findViewById(R.id.botonregistrar);
        btnResgitrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReg = new Intent(MainActivity.this, Registro.class); //primero ponemos la clase en la que estamos y despues la clase a la que vamos a llamar
                MainActivity.this.startActivity(intentReg);//
            }
        });
    }
}
