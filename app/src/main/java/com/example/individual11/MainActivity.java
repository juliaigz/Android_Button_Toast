package com.example.individual11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.individual11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private ImageButton imageButtonAndroid;
    private ActivityMainBinding binding; //1 era parte del binding

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); //2 da parte del binding
        setContentView(binding.getRoot());

        imageButton1 = binding.imageButton1;
        imageButton2 = binding.imageButton2;
        imageButton3 = binding.imageButton3;
        imageButton4 = binding.imageButton4;
        imageButton5 = binding.imageButton5;
        imageButton6 = binding.imageButton6;
        imageButtonAndroid = binding.imageButtonAndroid;

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            printToast("image Button 1");
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("imageButton 2");
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 3");
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 4");
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button5");
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button 6");
            }
        });

        imageButtonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printToast("image Button Android");
            }
        });
    }

    protected void printToast(String imgName){
        Context contexto = getApplicationContext();
        CharSequence mensaje = "La imagen es : "+imgName;
        int duracion = Toast.LENGTH_SHORT;
        Toast.makeText(contexto, mensaje, duracion).show();
    }
}