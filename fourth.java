package com.example.shivanii.assign1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void div(View v)
    {
        EditText e1=(EditText)findViewById(R.id.num1);
        EditText e2=(EditText)findViewById(R.id.num2);

        int n1,n2;
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());

        int sum=n1/n2;

        TextView result=(TextView) findViewById(R.id.res1);
        result.setText(Integer.toString(sum));
    }
    public void next(View v)
    {
        Toast.makeText(this,"You are at the end of app",Toast.LENGTH_SHORT).show();
    }

    public void prev(View v)
    {
        Intent intent=new Intent(this,third.class);
        startActivity(intent);
    }
}
