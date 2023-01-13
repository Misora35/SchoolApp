package jp.ac.hitp.it2073502.schoolapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class login extends AppCompatActivity {

//    private DatabaseHelper _helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        _helper = new DatabaseHelper(this);
        Spinner spinner = (Spinner) findViewById(R.id.Spinner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String) adapterView.getSelectedItem();
             }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //何も選択されなかった時の処理
            }
        });
        EditText UserID = findViewById(R.id.ID);
        EditText name2 = findViewById(R.id.name2);

        SharedPreferences data = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        Button button = findViewById(R.id.submit);

        UserID.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                }
            }
        });
        name2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!b) {
                    button.setEnabled(true);
                }
            }
        });

        button.setOnClickListener((View v) -> {
        /*
            SQLiteDatabase db = _helper.getWritableDatabase();
            String sqlInsert = "INSERT INTO UserClass (_class, _ID, _Name) VALUES (?, ?, ?)";
            SQLiteStatement stmt = db.compileStatement(sqlInsert);
            stmt.bindString(1, spinner.getSelectedItem().toString());
            stmt.bindString(2, UserID.getText().toString());
            stmt.bindString(3, name2.getText().toString());
            stmt.executeInsert();
        */
            SharedPreferences.Editor editor = data.edit();
            editor.putString("Class", spinner.getSelectedItem().toString());
            editor.putString("UserID", UserID.getText().toString());
            editor.putString("username", name2.getText().toString());
            editor.apply();

            //startActivity(new Intent(this, MainActivity.class));
            startActivity(new Intent(this, MainActivity.class));
        });
    }
    /*
    @Override
    protected void onDestroy() {

        _helper.close();
        super.onDestroy();
    }
*/
}