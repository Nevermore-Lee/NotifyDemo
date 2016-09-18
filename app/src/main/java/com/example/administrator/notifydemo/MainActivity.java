package com.example.administrator.notifydemo;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
    }

    public void doClick(View view){
//        Dialog
//        AlertDialog.Builder builder =new AlertDialog.Builder(this);
//        builder.setTitle("Title")
//                .setMessage("Message")
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                })
//                .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                })
//                .show();

//        Toast
//        Util.showToast(this,"Mine Toast");
//        Toast.makeText(this,"Mine Toast",Toast.LENGTH_SHORT).show();
//        SnakBar
        Snackbar.make(view, "data deleted",Snackbar.LENGTH_LONG)
                .setAction("Undo", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                    }
                })
                .show();
    }
}
