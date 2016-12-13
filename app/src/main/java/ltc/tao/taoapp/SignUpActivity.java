package ltc.tao.taoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {


    //Explicit
    private EditText nameEditText, userEditText, pasEditText;
    private String nameString,userString, pasString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        pasEditText = (EditText) findViewById(R.id.editText3);



    } // Main Method


    public void clickSignUpSign(View view) {

        nameString = nameEditText.getText().toString().trim();
        nameString = userEditText.getText().toString().trim();
        nameString = pasEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") || userString.equals("") || pasString.equals("")) {

            //Have Space
            Log.d("13decV1", "Have Space");


        }

    } // clickSign



} // Main Class
