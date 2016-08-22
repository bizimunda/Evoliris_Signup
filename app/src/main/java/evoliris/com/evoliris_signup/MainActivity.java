package evoliris.com.evoliris_signup;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private TextView tvMainWelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMainWelcome=(TextView)findViewById(R.id.tv_main_welcome);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String username= extras.getString("username");
            Toast.makeText(MainActivity.this,"Welcome: "+ username, Toast.LENGTH_SHORT).show();
            tvMainWelcome.setText(getString(R.string.welcome)+username);

        }


    }



}
