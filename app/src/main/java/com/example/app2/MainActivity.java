package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_button;

    private Button btn_move;
    private EditText it_id;
    private String str;

    @Override
    //onCreate: activity 처음 실행될 때 하는 일
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        it_id = findViewById(R.id.it_id);
        btn_button = findViewById(R.id.btn_button);

        btn_move = findViewById(R.id.btn_move);

        btn_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                it_id.setText("Juyoung");
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = it_id.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                intent.putExtra("str", str);
                startActivity(intent); // 액티비티 이동
            }
        });


    }
}