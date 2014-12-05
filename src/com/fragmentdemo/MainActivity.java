package com.fragmentdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
     Configuration config = getResources().getConfiguration();  
     
     FragmentManager fragmentManager = getFragmentManager();
     FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
     /**
      * Check the device orientation and act accordingly
      */
     if(config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
    	 /**
    	  * Landscape mode of the device
    	  */
    	 LMfragment lm = new LMfragment();
    	 fragmentTransaction.replace(android.R.id.content, lm);
     }else {
    	 /*
    	  * Portrait mode of the device
    	  */
    	 PMfragment pm = new PMfragment();
    	 fragmentTransaction.replace(android.R.id.content, pm);
     }
     fragmentTransaction.commit();
    } 
}
