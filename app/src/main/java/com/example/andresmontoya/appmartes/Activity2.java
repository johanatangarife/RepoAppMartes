package com.example.andresmontoya.appmartes;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    RadioGroup grupo;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        grupo= (RadioGroup) findViewById(R.id.radioGroup);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId== R.id.radioButton){
                    Toast.makeText(getApplication(), "Usted oprimio el boton 1", Toast.LENGTH_SHORT).show();
                } else if (checkedId== R.id.radioButton2){
                    Toast.makeText(getApplication(), "Usted oprimio el boton 2", Toast.LENGTH_SHORT).show();
                } else if (checkedId== R.id.radioButton3){
                    Toast.makeText(getApplication(), "Usted oprimio el boton 3", Toast.LENGTH_SHORT).show();
                } else if (checkedId== R.id.radioButton4){
                    Toast.makeText(getApplication(), "Usted oprimio el boton 4", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        super.onBackPressed();
    }
}
