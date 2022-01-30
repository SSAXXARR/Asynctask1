package com.example.asynctask;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailView extends LinearLayout {

    private TextView itemView;

    public DetailView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    //Когда все элементы из Compound View заполнены и готовы к использованию,
    // вызывается метод onFinishInflate
    // он нужен, чтобы все показать (как onCreate у Activity)
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        itemView = findViewById(R.id.info);
    }

    public void showItem(String item){
        itemView.setText(item);
    }
}
