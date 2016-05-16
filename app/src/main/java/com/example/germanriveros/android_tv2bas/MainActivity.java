package com.example.germanriveros.android_tv2bas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cafe);
    }





    public void mostrarAlerta(View v)
    {

        Toast toast = Toast.makeText(getApplicationContext(), "Has hecho click",Toast.LENGTH_LONG);

        toast.show();
    }


}
