package com.example.asynctask;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

public class ItemListAdapter extends ArrayAdapter<String> {

    public static String[] values = new String[]{"Android", "IOS", "Windows",
            "MAC", "UBUNTU", "Linux", "iphone", "Android", "IOS", "Windows",
            "MAC", "UBUNTU", "Linux", "iphone", "Android", "IOS", "Windows",
            "MAC", "UBUNTU", "Linux", "iphone", "Android", "IOS", "Windows",
            "MAC", "UBUNTU", "Linux", "iphone", "Android", "IOS", "Windows",
            "MAC", "UBUNTU", "Linux", "iphone"};

    public ItemListAdapter(@NonNull Context context) {
        //здесь мы передаем контекст (когда будем создавать экземпляр класса)
        //сделаем список из стандартных Андроид списков
        //и передадим созданный выше массив строк
        super(context, android.R.layout.simple_list_item_1, values);
    }
}
