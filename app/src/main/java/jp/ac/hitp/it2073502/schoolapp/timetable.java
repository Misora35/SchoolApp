package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class timetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        TableLayout Monday = findViewById(R.id.monday);
        TableLayout Tuesday = findViewById(R.id.tuesday);
        TableLayout Wednesday = findViewById(R.id.wednesday);
        TableLayout Thursday = findViewById(R.id.thursday);
        TableLayout Friday = findViewById(R.id.friday);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("月");
        adapter.add("火");
        adapter.add("水");
        adapter.add("木");
        adapter.add("金");

        Spinner spinner = (Spinner) findViewById(R.id.Spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String) adapterView.getSelectedItem();
                int aa = adapterView.getSelectedItemPosition();
                switch(aa) {
                    case 1: Monday.setVisibility(View.GONE);
                            Tuesday.setVisibility(View.VISIBLE);
                            Wednesday.setVisibility(View.GONE);
                            Thursday.setVisibility(View.GONE);
                            Friday.setVisibility(View.GONE);
                            break;
                    case 2: Monday.setVisibility(View.GONE);
                            Tuesday.setVisibility(View.GONE);
                            Wednesday.setVisibility(View.VISIBLE);
                            Thursday.setVisibility(View.GONE);
                            Friday.setVisibility(View.GONE);
                            break;
                    case 3: Monday.setVisibility(View.GONE);
                            Tuesday.setVisibility(View.GONE);
                            Wednesday.setVisibility(View.GONE);
                            Thursday.setVisibility(View.VISIBLE);
                            Friday.setVisibility(View.GONE);
                            break;
                    case 4: Monday.setVisibility(View.GONE);
                            Tuesday.setVisibility(View.GONE);
                            Wednesday.setVisibility(View.GONE);
                            Thursday.setVisibility(View.GONE);
                            Friday.setVisibility(View.VISIBLE);
                            break;
                    default : Monday.setVisibility(View.VISIBLE);
                              Tuesday.setVisibility(View.GONE);
                              Wednesday.setVisibility(View.GONE);
                              Thursday.setVisibility(View.GONE);
                              Friday.setVisibility(View.GONE);
                              break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}