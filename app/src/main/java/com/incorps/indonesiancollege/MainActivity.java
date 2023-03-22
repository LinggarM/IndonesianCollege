package com.incorps.indonesiancollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUniversity;
    private ArrayList<University> list = new ArrayList<>();
    private Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvUniversity = findViewById(R.id.rv_university);

        rvUniversity.setHasFixedSize(true);
        list.addAll(UniversityData.getData());

        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
        ListUniversityAdapter listUniversityAdapter = new ListUniversityAdapter(list);
        rvUniversity.setAdapter(listUniversityAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                break;
        }
    }
}
