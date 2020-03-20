package com.example.vanin_praktika_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Element> states = new ArrayList();
    ListView MainList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData(); // начальная инициализация списка
        MainList = (ListView) findViewById(R.id.MainList); // получаем элемент ListView
        ElementAdapter stateAdapter = new ElementAdapter(this, R.layout.list_item, states); // создаем адаптер
        MainList.setAdapter(stateAdapter); // устанавливаем адаптер
    }
    private void setInitialData() {
        for (int i = 1; i <= 1000000; i++) {
            if(i%2==0) {
                states.add(new Element (Translator.fromIntToString(i), R.drawable.airport, 0xFFCCCCCC));
            }
            else {
                states.add(new Element (Translator.fromIntToString(i), R.drawable.airport, 0xFFFFFFFF));
            }
        }
    }
}