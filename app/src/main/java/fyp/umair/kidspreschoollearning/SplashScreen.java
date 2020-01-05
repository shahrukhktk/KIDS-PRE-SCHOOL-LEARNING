package fyp.umair.kidspreschoollearning;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivity;

public class SplashScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable()
        {
            // Using handler with postDelayed called runnable run method
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

                // close this activity
                finish();
            }
        }, 3*1000); // wait for 3 seconds

    }
}
