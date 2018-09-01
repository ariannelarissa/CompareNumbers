package iics.hipe.ariannelarissa.comparenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CompareNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_num);

        Button compareMeButton = (Button) findViewById(R.id.compareButton);
        compareMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText input1 = (EditText) findViewById(R.id.input1);
                EditText input2 = (EditText) findViewById(R.id.input2);
                TextView resultTextView = (TextView) findViewById(R.id.textView_result);

                int firstNum = Integer.parseInt(input1.getText().toString());
                int secondNum = Integer.parseInt(input2.getText().toString());

                if(firstNum > secondNum){
                    resultTextView.setText("First Number is more than the second number");
                } else if(secondNum > firstNum){
                    resultTextView.setText("Second Number is more than the first number");
                } else {
                    resultTextView.setText("Both numbers are equal");
                }
            }
        });
    }
}
