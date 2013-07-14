package com.scienceomatic.medjelly;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class treatment extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treatment);

        addListener();
        addListener2();
        addListener3();
        addListener4();
        addListener5();
        addListener6();
        addListener7();
        addListener8();
        addListener9();
        addListener10();
        addListener11();
        addListener12();
        addListener13();

    }

    public void addListener() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentb);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t1.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void addListener2() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentc);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t2.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void addListener3() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentd);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t3.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener4() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmente);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t4.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void addListener5() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentf);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t5.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener6() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentg);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t6.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener7() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmenth);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t7.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener8() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmenti);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t8.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void addListener9() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentj);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t9.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener10() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentk);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t10.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener11() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentl);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t11.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void addListener12() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentm);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t12.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


    public void addListener13() {
        ImageButton next = (ImageButton) findViewById(R.id.itreatmentn);
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), t13.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }


}
