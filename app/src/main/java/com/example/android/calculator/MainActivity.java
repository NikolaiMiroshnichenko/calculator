package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double extractedValue1;
    Double extractedValue2;
    Double extractedValue3;
    String output;
    Double result;
    Integer typeOperandButton;
    Integer chek_TV;
    String operand_Value;


    public void actionOperandOncklik() {
        EditText editText = findViewById(R.id.editText);
        String extracted = editText.getText().toString();
        extractedValue1 = Double.parseDouble(extracted);
        output = "" + extractedValue1;
        TextView outputTextView = findViewById(R.id.outputTextView);
        outputTextView.setText(output);
        editText.setText("");
    }


    public void operandButtonAction_Summery(View view) {
        actionOperandOncklik();
        typeOperandButton = 1;
        operand_Value = " + ";
    }

    public void operandButtonAction_Subtraction(View view) {
        actionOperandOncklik();
        typeOperandButton = 2;
        operand_Value = " - ";
    }

    public void operandButtonAction_Multiplication(View view) {
        actionOperandOncklik();
        typeOperandButton = 3;
        operand_Value = " * ";
    }

    public void operandButtonAction_Segmentation(View view) {
        actionOperandOncklik();
        typeOperandButton = 4;
        operand_Value = " / ";

    }

    public void resultButtonAction(View view) {


        EditText editText = findViewById(R.id.editText);
        String extracted = editText.getText().toString();
        extractedValue2 = Double.parseDouble(extracted);
        editText.setText("");
        /* * */
        if (typeOperandButton == 1) {
            result = extractedValue1 + extractedValue2;
        } else if (typeOperandButton == 2) {
            result = extractedValue1 - extractedValue2;
        } else if (typeOperandButton == 3) {
            result = extractedValue1 * extractedValue2;
        } else if (typeOperandButton == 4) {
            result = extractedValue1 / extractedValue2;
        } else {
            chek_TV = 1;
        }

        output = output + operand_Value + extractedValue2 + " = " + result;
        TextView outputTextView = findViewById(R.id.outputTextView);
        if (chek_TV == 1) {
            outputTextView.setText("Algoritm of introduced data is wrong");
        } else {
            outputTextView.setText(output);
        }
    }

    public void sqrButtonAction(View view) {
        EditText editText = findViewById(R.id.editText);
        String extracted = editText.getText().toString();
        extractedValue3 = Double.parseDouble(extracted);
        output = "" + Math.sqrt(extractedValue3);
        TextView outputTextView = findViewById(R.id.outputTextView);
        outputTextView.setText(output);
        editText.setText("");
    }


}
