package sg.edu.rp.c346.id22012433.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner spnYesN0;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spnYesN0 = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

spnYesN0.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                textView.setText("Spinner Item, Yes Selected");
                break;
            case 1:
                textView.setText("Spinner Item, No Selected");
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
    }
}
