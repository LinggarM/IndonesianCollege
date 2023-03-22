package com.incorps.indonesiancollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imgLogo;
    TextView txtName, txtDesc, txtFaculty, txtAddress, txtWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra("name"));
        }

        imgLogo = findViewById(R.id.img_logo);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);
        txtFaculty = findViewById(R.id.txt_faculty);
        txtAddress = findViewById(R.id.txt_address);
        txtWebsite = findViewById(R.id.txt_website);

        imgLogo.setImageResource(getIntent().getIntExtra("logo", R.drawable.img_ui));
        txtName.setText(getIntent().getStringExtra("name"));
        txtDesc.setText(getIntent().getStringExtra("desc"));
        txtFaculty.setText(getIntent().getStringExtra("faculty"));
        txtAddress.setText(getIntent().getStringExtra("address"));
        txtWebsite.setText(getIntent().getStringExtra("website"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
