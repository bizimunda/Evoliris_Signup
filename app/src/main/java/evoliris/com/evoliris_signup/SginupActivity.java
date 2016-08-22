package evoliris.com.evoliris_signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import evoliris.com.evoliris_signup.app.LoginApplication;
import evoliris.com.evoliris_signup.model.AppUser;


public class SginupActivity extends ActionBarActivity {

    public static final int REQUEST_CODE=202;
    private EditText etSignupUsername, etSignupEmail, etSignupPassword;
    private Button btnSignupSubmit;

    private LoginApplication application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginup);

        application= (LoginApplication) getApplication();

        etSignupEmail= (EditText) findViewById(R.id.et_signup_email);
        etSignupUsername= (EditText) findViewById(R.id.et_signup_username);
        etSignupPassword= (EditText) findViewById(R.id.et_signup_password);

        btnSignupSubmit= (Button) findViewById(R.id.btn_signup_submit);

        btnSignupSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppUser user= new AppUser();
                user.setUserName(etSignupUsername.getText().toString());
                user.setEmail(etSignupEmail.getText().toString());
                user.setPassword(etSignupPassword.getText().toString());

                application.getUsers().add(user);
                Intent data= new Intent(SginupActivity.this, LoginActivity.class);
                data.putExtra("username", user.getUserName());
                data.putExtra("password", user.getPassword());
                setResult(RESULT_OK, data);


                finish();
            }
        });
    }



}
