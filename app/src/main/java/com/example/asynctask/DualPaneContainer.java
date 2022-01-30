package com.example.asynctask;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

//он отвечает за взаимодействие itemListView and DetailView.
public class DualPaneContainer extends LinearLayout implements PaneContainer{
    private DetailView detailView;

    public DualPaneContainer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        detailView = findViewById(R.id.detail);
    }
    //имплементируемый метод
    @Override
    public void showItem(String item) {
        //другой showItem, который у нас в классе DetailView
        detailView.showItem(item);
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
