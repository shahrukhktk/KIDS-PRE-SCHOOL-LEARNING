package fyp.umair.kidspreschoollearning.Maths_Category.Counting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumEight;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumFive;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumFour;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumNine;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumOne;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumSeven;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumSix;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumTen;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumThree;
import fyp.umair.kidspreschoollearning.Maths_Category.Counting.CountingFragments.NumTwo;
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
        if (view == findViewById(R.id.numOne_Id))
        {
            Fragment fragment = new NumOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numTwo_Id))
        {
            Fragment fragment = new NumTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numThree_Id))
        {
            Fragment fragment = new NumThree();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numFour_Id))
        {
            Fragment fragment = new NumFour();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numFive_Id))
        {
            Fragment fragment = new NumFive();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numSix_Id))
        {
            Fragment fragment = new NumSix();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numSeven_Id))
        {
            Fragment fragment = new NumSeven();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numEight_Id))
        {
            Fragment fragment = new NumEight();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numNine_Id))
        {
            Fragment fragment = new NumNine();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numTen_Id))
        {
            Fragment fragment = new NumTen();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
    }
}
