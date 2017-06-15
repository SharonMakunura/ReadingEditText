package muzinda.sharon.readingedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {

    @BindView(R.id.inputView)EditText rawNumber;
    @BindView(R.id.textDisplay)TextView numDisplay;

    //@BindView(R.id.showButton)Button showButton;   Declare this if using onClickListener.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        /*This is the method in an OnClickListener.  See below using Butterknife.
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //For some reason initializing these variables outside OnClickListener caused my app to crash
                String numString = rawNumber.getText().toString();
                final int valNum =  Integer.valueOf(numString);
                //Let's do a small calculation to check if valNum has truly become an int
                Toast.makeText(MainActivity.this,"The next number is " +(valNum+1),Toast.LENGTH_LONG).show();
            }
        });*/



    }

@OnClick (R.id.showButton)
    public void showNummber(){
        String numString = rawNumber.getText().toString();
        final int valNum =  Integer.valueOf(numString);
        //Let's do a small calculation to check if valNum has truly become an int
        Toast.makeText(MainActivity.this,"The next number is " +(valNum+1),Toast.LENGTH_LONG).show();

    }
}



