package dev.ujjwal.callbackinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CallBackActivity extends AppCompatActivity {

    WorkingClass workingClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_back);

        workingClass = new WorkingClass(new CallBackInterface() {
            @Override
            public void data(String data) {
                Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workingClass.passData();
            }
        });
    }
}
