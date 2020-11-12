package com.example.imageview_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] imgId={   R.mipmap.img1, R.mipmap.img2, R.mipmap.img3, R.mipmap.img4, R.mipmap.img5,
                    R.mipmap.img6, R.mipmap.img7, R.mipmap.img8,R.mipmap.img9, R.mipmap.img10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BTN_TRIG(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        EditText editText = findViewById(R.id.editTextNumber);

        InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);//收起鍵盤

        if(!String.valueOf(editText.getText()).equals(""))
        {
            if(Integer.parseInt(String.valueOf(editText.getText())) >=1
            && Integer.parseInt(String.valueOf(editText.getText())) <=10)
            {
                imageView.setImageResource(imgId[Integer.parseInt(String.valueOf(editText.getText()))-1]);
            }
            else
                Toast.makeText(this,"請輸入正確數字(1~10)",Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"請輸入數字(1~10)",Toast.LENGTH_SHORT).show();

    }
}