package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private final String GREETER ="Hola esto es el segundo activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = (Button) findViewById(R.id.buttonMain);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              //acceder a otro activity y mostrar string
               Intent intent = new Intent(MainActivity.this,SecondActivity.class);
               intent.putExtra("greeter", GREETER);
               startActivity(intent);

           }
       });
    }
}