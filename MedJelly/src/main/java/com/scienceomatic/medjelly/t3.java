package com.scienceomatic.medjelly;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class t3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.t3, menu);
        return true;
    }
    
}
