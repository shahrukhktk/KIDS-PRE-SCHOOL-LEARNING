package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Fragments.Character_A_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_B_Fragment;
import fyp.umair.kidspreschoollearning.R;

public class EnglishAlphabets_Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets_);
    }

    public void EnglishAlphabetsFragmentsCall(View view) {
        if (view == findViewById(R.id.character_A_Id))
        {
            Fragment fragment = new Character_A_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_B_Id))
        {
            Fragment fragment = new Character_B_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
    }
}
