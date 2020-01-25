package fyp.umair.kidspreschoollearning.Habits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivity;
import fyp.umair.kidspreschoollearning.R;

public class HabitsDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habits_dashboard);
    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
