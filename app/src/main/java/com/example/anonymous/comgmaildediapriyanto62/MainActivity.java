package com.example.anonymous.comgmaildediapriyanto62;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
public class MainActivity extends AppCompatActivity {
    TabHost tabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (TabHost)findViewById(R.id.Data);
        tabs.setup();
        TabHost.TabSpec spec = tabs.newTabSpec("Tag1");
        //Kita akan mendeklarasikan tab 1
        spec.setContent(R.id.Data);
        spec.setIndicator("Data");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("Tag 2");
        spec.setContent(R.id.Sensor);
        spec.setIndicator("Sensor");
        tabs.addTab(spec);
        tabs.setCurrentTab(0);
    }
}
