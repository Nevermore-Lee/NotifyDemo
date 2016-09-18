package com.example.administrator.notifydemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Lee on 2016/9/12.
 */
public class Util {
    private static Toast toast;
    public static void showToast(Context context,String content){
        if(toast==null){
            toast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }else {
            toast.setText(content);
        }
        toast.show();
    }
}
