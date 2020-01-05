package fyp.umair.kidspreschoollearning.Maths_Category.Counting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.R;

public class MathCounting extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_counting);
    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }

    public void CoutingNumbersFragmentsCall(View view)
    {

    }
}
