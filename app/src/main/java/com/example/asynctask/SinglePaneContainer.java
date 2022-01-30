package com.example.asynctask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SinglePaneContainer extends FrameLayout implements PaneContainer{
    private View listView;
    private DetailView detailView;

    public SinglePaneContainer(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        //у нашего FrameLayout есть всего 1 ребенок и это наш ListView,
        //тем самым этой командой мы получим на него ссылку
        listView = getChildAt(0);
    }

    @Override
    public void showItem(String item) {
        //уберем из FrameLayout всех детей, он будет пустой.
        removeViewAt(0);
        //дальше мы на его место
        //
        //2 что именно надо вставить. В detail находится описание как мы показываем детали
        //3 передаем ту штуку, куда это надо inflat-ить
        View.inflate(getContext(), R.layout.detail, this);
        //теперь наш child стал DetailView
        detailView = (DetailView) getChildAt(0);
        detailView.showItem(item);
    }

    @Override
    public boolean onBackPressed() {
        if(isListAttached()) return false;
        //если у нас на экране detail, то мы его убираем
        removeViewAt(0);
        //добавляем вместо него наш listView
        addView(listView);
        //возвращаю true, чтобы default back не отработал.
        return true;
    }
    //проверяет есть ли на экране список (только список)
    private boolean isListAttached(){
        //если мы еще не убили listView командой removeViewAt(0);
        //то данный метод вернет true.
        return listView.getParent() != null;
    }

}
