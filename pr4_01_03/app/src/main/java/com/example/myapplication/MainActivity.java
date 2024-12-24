package com.example.myapplication;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onStepAge(View view){
        EditText _name = findViewById(R.id.name);
        String strName = _name.getText().toString();
        setContentView(R.layout.step_2);
        TextView tv = findViewById(R.id.tvName);
        tv.setText("Очень приятно познакомиться "+strName+". \nМеня зовут Бисквит.\n Сколько тебе лет?");
    }
    public void  onStepSex(View view){
        EditText _age = findViewById(R.id.tbAge);
        String strAge = _age.getText().toString();
        setContentView(R.layout.step_3);
        TextView tvAge = findViewById(R.id.tvAge);
        tvAge.setText("Ничего себе ты большой, целых"+strAge+"лет \n Какого ты пола?");
    }
    public void onStepEmail(View view){
        setContentView(R.layout.step_4);
    }
}