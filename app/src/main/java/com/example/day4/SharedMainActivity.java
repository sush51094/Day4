package com.example.day4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SharedMainActivity extends AppCompatActivity {
private final String TAG = SharedMainActivity.class.getCanonicalName();
    private EditText edtName;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE);
        if(sharedPreferences.contains("name"))
        {
            String name =  sharedPreferences.getString("name",null);

            Log.d(TAG,name);
            Log.i(TAG,name);
            Log.v(TAG,name);
            Log.w(TAG,name);
            Log.e(TAG,name);

            edtName.setText(name);
        }

    }

    //method                      //parameter
    public void btnSaveClick(View view) {  //get the editor and set the value
        if (edtName.getText().length() != 0) {
            String name = edtName.getText().toString();
            SharedPreferences.Editor mEditor = sharedPreferences.edit();
            mEditor.putString("name", name);
            //mEditor.remove("name");

            mEditor.apply();
            //mEditor.commit();

            Intent mIntent = new Intent(SharedMainActivity.this,Privateactivity.class);
            startActivity(mIntent);




        }

    }
}
