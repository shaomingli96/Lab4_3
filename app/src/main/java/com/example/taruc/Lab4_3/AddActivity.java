package com.example.taruc.Lab4_3;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import my.edu.taruc.lab4_3.R;

public class AddActivity extends AppCompatActivity {
    EditText editTextName, editTextPhone, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editTextName = (EditText)findViewById(R.id.editTextName);
        editTextPhone = (EditText)findViewById(R.id.editTextPhone);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);

    }

    public void saveRecord(View v){

        UserRecord userRecord = new UserRecord();
        userRecord.setPhone(editTextPhone.getText().toString());
        userRecord.setName(editTextName.getText().toString());
        userRecord.setEmail(editTextEmail.getText().toString());

        UserSQLHelper userDataSource = new UserSQLHelper(this);
        userDataSource.insertUser(userRecord);

        this.finish(); //Terminate this Activity
    }

}
