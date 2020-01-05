package fyp.umair.kidspreschoollearning.Maths_Category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Dashboard.DashboardScreen;
import fyp.umair.kidspreschoollearning.R;

public class MathsDashboard extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_dashboard);
    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), DashboardScreen.class));
    }

    public void GoToCounting(View view)
    {

    }

    public void GoToTables(View view)
    {

    }
}
