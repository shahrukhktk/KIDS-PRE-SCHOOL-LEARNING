package fyp.umair.kidspreschoollearning.Maths_Category.Tables;

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
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_10;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_2;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_3;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_4;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_5;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_6;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_7;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_8;
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_9;
import fyp.umair.kidspreschoollearning.R;

public class MathTables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_tables);
    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }

    public void TablesNumbersFragmentsCall(View view)
    {
        if(view == findViewById(R.id.numTwo_Id))
        {
            Fragment fragment = new Table_2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numThree_Id))
        {
            Fragment fragment = new Table_3();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numFour_Id))
        {
            Fragment fragment = new Table_4();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numFive_Id))
        {
            Fragment fragment = new Table_5();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numSix_Id))
        {
            Fragment fragment = new Table_6();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numSeven_Id))
        {
            Fragment fragment = new Table_7();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numEight_Id))
        {
            Fragment fragment = new Table_8();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numNine_Id))
        {
            Fragment fragment = new Table_9();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.numTen_Id))
        {
            Fragment fragment = new Table_10();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }

    }
}
