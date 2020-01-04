package fyp.umair.kidspreschoollearning.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import fyp.umair.kidspreschoollearning.English_Category.EnglishActivity;
import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.R;

public class DashboardScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.dashboard_toolbar_Id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dashboard");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_feedback) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void GoToEnglishActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
    }

    public void GoToMathActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }
}
