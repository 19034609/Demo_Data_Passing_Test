package sg.edu.rp.c346.id19034609.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value",0.00);
        tvAnswer.setText("Double value received is: " + value);
    }
}
