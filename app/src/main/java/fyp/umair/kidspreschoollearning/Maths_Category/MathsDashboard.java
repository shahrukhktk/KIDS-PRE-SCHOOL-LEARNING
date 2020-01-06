package fyp.umair.kidspreschoollearning.Maths_Category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.Dashboard;
import fyp.umair.kidspreschoollearning.Maths_Category.Addition.MathAddition;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.MathCounting;
import fyp.umair.kidspreschoollearning.Maths_Category.Subtraction.MathSubtraction;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.MathTables;
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
        startActivity(new Intent(getApplicationContext(), Dashboard.class));
    }

    public void GoToCounting(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathCounting.class));
    }

    public void GoToTables(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathTables.class));
    }

    public void GoToSubtract(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathSubtraction.class));
    }

    public void GoToAddition(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathAddition.class));
    }
}
