package com.example.ryuilhan.select_test;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox CH1;
    LinearLayout LL;
    Button B1;
    RadioGroup RG1;
    RadioButton RB1;
    RadioButton RB2;
    RadioButton RB3;
    ImageView IV1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LL = (LinearLayout)findViewById(R.id.LinearLayout1);

        CH1 = (CheckBox)findViewById(R.id.checkBox);
        CH1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(CH1.isChecked()){
                    LL.setVisibility(View.VISIBLE);
                }
                else {
                    LL.setVisibility(View.INVISIBLE);
                }
            }
        });

        B1 = (Button)findViewById(R.id.button);
        RG1 = (RadioGroup)findViewById(R.id.radioGroup);
        RB1 = (RadioButton)findViewById(R.id.radioButton);
        RB2 = (RadioButton)findViewById(R.id.radioButton2);
        RB3 = (RadioButton)findViewById(R.id.radioButton3);
        IV1 = (ImageView)findViewById(R.id.imageView);

        RG1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                IV1.setVisibility(View.INVISIBLE);
                if(RB1.isChecked()){
                    IV1.setImageResource(R.drawable.images);
                }else if(RB2.isChecked()){
                    IV1.setImageResource(R.drawable.images2);
                }else if(RB3.isChecked()){
                    IV1.setImageResource(R.drawable.images3);
                }
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IV1.setVisibility(View.VISIBLE);
            }
        });






    }
}

