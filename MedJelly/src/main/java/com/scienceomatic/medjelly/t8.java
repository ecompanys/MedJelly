package jellyfish.java;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class t8 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t8);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.t8, menu);
        return true;
    }
    
}
