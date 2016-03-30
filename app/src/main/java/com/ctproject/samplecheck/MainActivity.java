package com.ctproject.samplecheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean pertamaJalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pertamaJalan = getSharedPreferences("JALAN",MODE_PRIVATE).getBoolean("pertamajalan",true);
        if(pertamaJalan){
            Toast.makeText(this, "Aplikasi baru pertama kali dijalankan!", Toast.LENGTH_SHORT).show();

            getSharedPreferences("JALAN",MODE_PRIVATE)
                    .edit()
                    .putBoolean("pertamajalan", false)
                    .commit();
        }
        else{
            Toast.makeText(this, "Aplikasi sudah beberapa kali dijalankan!", Toast.LENGTH_SHORT).show();
        }
    }
}
