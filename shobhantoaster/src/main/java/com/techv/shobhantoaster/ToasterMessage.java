package com.techv.shobhantoaster;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {

    public static String licenceKey = null;

    public void init(String licenceKey){
        this.licenceKey = licenceKey;
    }

    public static void s(Context c, String message){

        if(validateThelicenceKey(licenceKey)){
            Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(c,"Invalid licence key",Toast.LENGTH_SHORT).show();
        }

    }

    private static boolean validateThelicenceKey(String licenceKey){

        if(licenceKey.equalsIgnoreCase("shobhan")){
            return true;
        }
        else{
            return  false;
        }

    }
}