package com.rodgers.sheilaassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText lenInput;
    EditText valueOutput;
    double convertedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Meathod millimeterToInches
    public double millimeterToInches ( double millimeters ){
        double inches;
        inches = millimeters/25.4;
        return inches;
    }

    public void convert(View view) {

        //  Getting the input from edit text
        valueOutput = findViewById(R.id.inches);
        lenInput =  findViewById(R.id.milimeters);
        double inputLength = 0;
        //int invalid = 1;

        if( lenInput.getText().toString().length() == 0 )
        {
            lenInput.setError("Enter a valid length");
            //Toast.makeText(MainActivity.this, "Enter a valid Length", Toast.LENGTH_LONG ).show();
        }

        else {
            /// invalid = 0;
            inputLength = Double.parseDouble(lenInput.getText().toString());
            convertedValue = millimeterToInches(inputLength);
            valueOutput.setText(String.valueOf(convertedValue));
        }

    }

    public void exit(View view) {

        valueOutput.getText().clear();
        lenInput.getText().clear();

    }
}

