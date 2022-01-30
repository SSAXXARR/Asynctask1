package com.example.asynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private PaneContainer container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
    }

    public PaneContainer getContainer() {
        return container;
    }

    //событие, что нажалась кнопка back оно приходит в главную активити.

    @Override
    public void onBackPressed() {
        //если он все сделал сам и вернет true, то просто уходим от сюда.
        if(container.onBackPressed()){return;}
        //default action
        super.onBackPressed();
    }
}