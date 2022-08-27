package com.example.nars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button changetext;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      message = (TextView) findViewById(R.id.text);
      changetext = (Button) findViewById(R.id.btr);
      changetext.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              message.setText(" client tshiakama");
          }
      });
      changetext.setOnLongClickListener(new View.OnLongClickListener() {
          @Override
          public boolean onLongClick(View view) {
              message.setText("Client Kabanemi");
              return false;
          }
      }); 
    }
}