package com.hudawei.toastsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void defaultToast(View view){
        Toast.makeText(this,"默认的Toast",Toast.LENGTH_SHORT).show();
    }
    public void textColorToast(View view){
        Toast toast=Toast.makeText(this,"默认的Toast",Toast.LENGTH_SHORT);
        TextView textView=(TextView) toast.getView().findViewById(android.R.id.message);
        textView.setTextColor(Color.GREEN);
        toast.show();
    }
    public void changeLayoutToast(View view){
        Toast toast=Toast.makeText(this,"改变布局的Toast",Toast.LENGTH_SHORT);
        ViewGroup layout=(LinearLayout) toast.getView();//为null
        ImageView imageView=new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        layout.addView(imageView,0);
        toast.setText("改变布局的Toast");
        toast.show();
    }
    public void customToast(View view){
        LayoutInflater inflater=getLayoutInflater();
        View customView=inflater.inflate(R.layout.custom_toast,null);
        Toast toast=new Toast(this);
        toast.setView(customView);
        toast.show();
    }
    public void gravityToast(View view){
        Toast toast=Toast.makeText(this,"默认的Toast",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
