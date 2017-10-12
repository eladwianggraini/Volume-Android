package com.example.elladw.volume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtWidth, edtHeight, edtLength;
    private TextView tvResult;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWidth = (EditText)findViewById(R.id.edt_width);
        edtHeight = (EditText)findViewById(R.id.edt_height);
        edtLength = (EditText)findViewById(R.id.edt_length);
        tvResult = (TextView)findViewById(R.id.tv_result);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        btnCalculate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btn_calculate){
            String lenght = edtLength.getText().toString().trim();
            String width = edtWidth.getText().toString().trim();
            String height = edtHeight.getText().toString().trim();

            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(lenght)){
                isEmptyFields = true;
                edtLength.setError("Field initidak boleh kosong");
            }
            if (TextUtils.isEmpty(width)){
                isEmptyFields = true;
                edtWidth.setError("Field initidak boleh kosong");
            }
            if (TextUtils.isEmpty(height)){
                isEmptyFields = true;
                edtHeight.setError("Field initidak boleh kosong");
            }
            if (!isEmptyFields){
                double l = Double.parseDouble(lenght);
                double w = Double.parseDouble(width);
                double h = Double.parseDouble(height);
                double volume = l * w * h;
                tvResult.setText(String.valueOf(volume));
            }

        }
    }




}
