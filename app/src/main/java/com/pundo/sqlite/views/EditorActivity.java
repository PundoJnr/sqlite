package com.pundo.sqlite.views;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pundo.sqlite.R;

public class EditorActivity extends AppCompatActivity {

    EditText name, breed, weight;
    Spinner gender;

    private int mGender=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalog_activity);

        init();

        SetupSpinner();

    }

    private void SetupSpinner() {

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.gender,android.R.layout.simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gender.setAdapter(adapter);

        //onclick
        gender.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    private void init() {
        name = findViewById(R.id.edit_pet_name);
        breed = findViewById(R.id.edit_pet_breed);
        weight = findViewById(R.id.edit_pet_weight);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.dots, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                //add
                return true;

            case R.id.delete:
                //delete
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
