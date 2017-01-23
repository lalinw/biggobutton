package lalinw.washington.edu.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {

    private int count;
    Button buttonPush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        count = 1;
        buttonPush = (Button) findViewById(R.id.buttonPush);
        buttonPush.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View view) {
                //action
                buttonPush.setText("You have pushed me " + (count++) + " time(s)!");
            }
        });
    }

}
