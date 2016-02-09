package org.blogblocks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Government extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government);
    }
        public void openBIMap(View view) {
            Intent intent = new Intent(this, ImmigrationMap.class);
            this.startActivity(intent);
        }
        public void openUSMap(View view) {
            Intent intent = new Intent(this, USEmbassyMap.class);
            this.startActivity(intent);
    }
    }
