package com.example.exercise;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{ //החלק האחרון חשוב בשביל הלחיצות
    TextView tv_message;
    Button btn_change;
    Button btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tv_message = findViewById(R.id.tv_message);
        btn_change = findViewById(R.id.btn_change);
        btn_reset = findViewById(R.id.btn_reset);
        btn_change.setOnClickListener(this);
        btn_reset.setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    public void onClick(View v)
    {
        if(v==btn_reset){
            tv_message.setText("לחץ עליי!");
        }
        if(v==btn_change){
            tv_message.setText("איזה כיף! האפליקציה עובדת");
        }
    }
}