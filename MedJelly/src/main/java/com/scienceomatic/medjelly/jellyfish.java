package jellyfish.java;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class jellyfish extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jellyfish);

        addListenerj1a();
        addListenerj1b();
        addListenerj2a();
        addListenerj2b();
        addListenerj3a();
        addListenerj3b();
        addListenerj4a();
        addListenerj4b();
        addListenerj5a();
        addListenerj5b();
        addListenerj6a();
        addListenerj6b();
        addListenerj7a();
        addListenerj7b();
        addListenerj8a();

    }

    public void addListenerj1a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj1a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j1a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj1b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj1b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j1b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj2a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj2a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j2a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj2b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj2b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j2b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj3a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj3a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j3a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj3b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj3b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j3b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj4a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj4a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j4a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj4b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj4b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j4b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj5a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj5a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j5a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj5b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj5b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j5b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj6a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj6a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j6a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj6b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj6b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j6b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj7a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj7a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j7a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj7b() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj7b);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j7b.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListenerj8a() {
        ImageButton next = (ImageButton) findViewById(R.id.Bj1a);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), j8a.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

}
