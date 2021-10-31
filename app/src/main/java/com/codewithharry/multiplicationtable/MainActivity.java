package com.codewithharry.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     TextView textView;
    Button button;
     EditText n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        n1 = findViewById(R.id.n1);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(n1.getText().toString());
//                textView.setText("num = " + num*2);
//                textView.setText("num = " + num*3);
//               int mul[] = new int[10];
//                for(int i=1; i<=10; i++){
//                    mul[i] = num *i;
//                    textView.setText("multiply = "+ mul[i]);
//                }
                ArrayList al = new ArrayList();
                for(int i=1; i<=10; i++){
                    al.add(num + " X " + i + " = " +num*i + "\n");

                }
                textView.setText("MULTIPLICATION TABLE : \n"+ al);

            }
        });
    }
}






