package com.kulik.radial.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;

import com.kulik.radial.RadialListView;
import com.kulik.sample.radial.R;

public class MyActivity extends Activity {
    RadialListView bc;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_l);
        BaseAdapter adapter = new MyAdapter(this, MyAdapter.icons);
        bc = (RadialListView) findViewById(R.id.bookcase);
        bc.setAdapter(adapter);
    }
    public void gravity(View b) {
        startActivity(new Intent(this, MyActivityR.class));
    }

    public void scrolTo1(View b) {
        bc.setSelection(1);
    }

    public void scrolTo3(View b) {
        bc.setSelection(3);
    }
}

