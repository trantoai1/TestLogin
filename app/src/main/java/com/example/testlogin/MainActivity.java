package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Button b1 = (Button) this.findViewById(R.id.dangky);
    b1.setOnClickListener(new SomeHansdler());
    }
    private class SomeHansdler implements View.OnClickListener {

        public void onClick(View clickedButton) {
            System.out.print(1111);
        }
    }
}
