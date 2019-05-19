package com.android.riversideproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.riversideproject.R;
import com.android.riversideproject.utilities.Utils;

public class RegisterActivity  extends AppCompatActivity {
    private LinearLayout rootLayout = null;
    private TextView headerTextView;
    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText confirmPasswordEditText;
    private EditText phoneNumberEditText;
    private Button registerButton;

    private String driverName = Utils.DEFAULT;
    private String driverEmail = Utils.DEFAULT;
    private String driverPassword = Utils.DEFAULT;
    private String driverConfirmPassword = Utils.DEFAULT;
    private String driverPhoneNumber = Utils.DEFAULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        headerTextView = findViewById(R.id.header_title);
        headerTextView.setText("Register");
        handleFormData();
    }

    private void handleFormData(){
        rootLayout = findViewById(R.id.driver_register_layout);
        nameEditText = findViewById(R.id.register_name_edittext);
        emailEditText = findViewById(R.id.register_email_edittext);
        passwordEditText = findViewById(R.id.register_password_edittext);
        confirmPasswordEditText = findViewById(R.id.register_confirm_password_edittext);
        phoneNumberEditText = findViewById(R.id.register_phone_edittext);
        registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isValidForm = isFormValidate();
                if(isValidForm){
                    Utils.showSnackbar(rootLayout, "Driver register successfully!!!");
                }
            }
        });
    }

    private boolean isFormValidate(){
        boolean isValidForm = false;
        if(Utils.isValidString(nameEditText.getText().toString())){
            driverName = nameEditText.getText().toString();
        }
        if(Utils.isValidString(emailEditText.getText().toString())){
            driverEmail = emailEditText.getText().toString();
        }
        if(Utils.isValidString(passwordEditText.getText().toString())){
            driverPassword = passwordEditText.getText().toString();
        }
        if(Utils.isValidString(confirmPasswordEditText.getText().toString())){
            driverConfirmPassword = confirmPasswordEditText.getText().toString();
        }
        if(Utils.isValidString(phoneNumberEditText.getText().toString())){
            driverPhoneNumber = phoneNumberEditText.getText().toString();
        }

        if(Utils.isValidString(driverName)){
            isValidForm = true;
        }else{
            isValidForm = false;
            Utils.showSnackbar(rootLayout, "Please enter valid name!");
        }
        if(Utils.isValidString(driverEmail) && isValidForm){
            isValidForm = true;
        }else if(isValidForm){
            isValidForm = false;
            Utils.showSnackbar(rootLayout, "Please enter valid email!");
        }
        if(Utils.isValidString(driverPassword) && isValidForm){
            isValidForm = true;
        }else if(isValidForm){
            isValidForm = false;
            Utils.showSnackbar(rootLayout, "Please enter valid password!");
        }
        if(Utils.isValidString(driverConfirmPassword) && isValidForm){
            isValidForm = true;
        }else if(isValidForm){
            isValidForm = false;
            Utils.showSnackbar(rootLayout, "Please enter valid confirm password!");
        }
        if(Utils.isValidString(driverPhoneNumber) && isValidForm){
            isValidForm = true;
        }else if(isValidForm){
            isValidForm = false;
            Utils.showSnackbar(rootLayout, "Please enter valid phone number!");
        }
        return isValidForm;
    }
}
