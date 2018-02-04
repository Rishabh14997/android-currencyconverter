package com.gmail.rishabh23jain.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view)
    {
        EditText dollarField=(EditText)findViewById(R.id.dollarField);
        Double dollarAmount=Double.parseDouble(dollarField.getText().toString());
        Double rupeeAmount=63.61*dollarAmount;
        Toast.makeText(getApplicationContext(),rupeeAmount + " rupee",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
