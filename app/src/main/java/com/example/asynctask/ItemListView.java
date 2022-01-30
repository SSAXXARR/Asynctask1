package com.example.asynctask;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

//это наш собственный клас, который уточняет поведение ListView
// который мы хотим
public class ItemListView extends ListView {

    public ItemListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //здесть мы берем наш адаптер и устанавливаем его.
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ItemListAdapter adapter = new ItemListAdapter(getContext());
        setAdapter(adapter);

        //цепляем слушатель клика
        setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //адаптер не только поставщик view, но он может отдать нам и сами данные.
                String item = adapter.getItem(position);
                //каждая view может запросить контекст
                //когда view запрашивает контекст
                // вернут не просто контекст а целую Activity
                MainActivity activity = (MainActivity) getContext();
                //метод который мы делали в MainActivity(getContainer)
                PaneContainer container = activity.getContainer();
                //просим показать наш item
                container.showItem(item);
            }
        });
    }


}
