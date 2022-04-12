package com.example.androidlistviewcastom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> itemList;

    public ItemsAdapter(Context context, ArrayList<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemList.indexOf(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Item item = itemList.get(i);
        view = LayoutInflater.from(context).inflate(R.layout.item, null);
        ((TextView)view.findViewById(R.id.textTitle)).setText(item.getTitle());
        ((TextView)view.findViewById(R.id.textSubtitle)).setText(item.getSubtitle());
        return view;
    }
}
