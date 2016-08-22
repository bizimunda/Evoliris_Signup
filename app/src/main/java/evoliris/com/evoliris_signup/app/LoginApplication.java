package evoliris.com.evoliris_signup.app;

import android.app.Application;

import java.util.ArrayList;

import evoliris.com.evoliris_signup.model.AppUser;

/**
 * Created by temp on 22/08/2016.
 */
public class LoginApplication extends Application {

    private ArrayList<AppUser> users;

    @Override
    public void onCreate() {
        super.onCreate();
        users=new ArrayList<>();
    }

    public ArrayList<AppUser> getUsers(){
        return users;
    }

}
