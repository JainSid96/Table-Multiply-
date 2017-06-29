package com.example.siddhantjain.multiplicationtables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView ListView = (ListView) findViewById(R.id.ListView);


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(20);
        seekBar.setProgress(10);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged (SeekBar seekBar,int i, boolean b) {
                final ArrayList<Integer> tables = new ArrayList<Integer>();
                for (int m = 1; m < 20; m++) {
                    int x = i * m;
                    tables.add(x);
                }
                ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1, tables);
                ListView.setAdapter(arrayAdapter);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        }
    }
