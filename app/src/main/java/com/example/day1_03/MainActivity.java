package com.example.day1_03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button closebutton ;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closebutton =(Button) findViewById(R.id.button);
        builder=new AlertDialog.Builder(this);
        closebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setMessage("Welcome to alert dialog demo").setTitle("Alert Dialog");
                builder.setMessage("Do you want to close").setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(getApplicationContext(), "Yes Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "No Clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alert=builder.create();
                alert.setTitle("Exit");
                alert.show();
            }
        });
    }
}