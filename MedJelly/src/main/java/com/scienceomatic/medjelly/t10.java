package jellyfish.java;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class t10 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.t10);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.t10, menu);
        return true;
    }
    
}
