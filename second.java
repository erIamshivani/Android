package com.example.shivanii.assign1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void sub(View v)
    {
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);

        int n1,n2;
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());

        int sub;
        sub=n1-n2;

        TextView t1=(TextView)findViewById(R.id.res1);
        t1.setText(Integer.toString(sub));
    }
    public void next(View v)
    {
        Intent intent=new Intent(this,third.class);
        startActivity(intent);
    }
public void prev(View v)
{
    Intent intent=new Intent(this,MainActivity.class);
    startActivity(intent);
}
}
