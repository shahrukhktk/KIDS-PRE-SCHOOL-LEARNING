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
import fyp.umair.kidspreschoollearning.Maths_Category.Tables.TablesFragments.Table_2;
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
    }
}
