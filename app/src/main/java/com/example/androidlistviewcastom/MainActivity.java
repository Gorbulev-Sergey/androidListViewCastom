package com.example.androidlistviewcastom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);
        list.setDivider(null);
        ArrayList<Item> itemList = new ArrayList<Item>() {{
            add(new Item() {{
                setTitle("Привет");
                setSubtitle("Как поживаете");
            }});
            add(new Item() {{
                setTitle("Любовь");
                setSubtitle("Красивая любовь");
            }});
            add(new Item() {{
                setTitle("Ветер");
                setSubtitle("Ветер дует");
            }});
        }};
        ItemsAdapter adapter = new ItemsAdapter(this, itemList);
        list.setAdapter(adapter);
    }
}