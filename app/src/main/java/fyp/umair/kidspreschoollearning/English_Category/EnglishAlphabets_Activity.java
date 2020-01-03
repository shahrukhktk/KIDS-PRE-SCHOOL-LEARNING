package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import fyp.umair.kidspreschoollearning.Fragments.Character_A_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_B_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_C_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_D_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_E_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_F_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_G_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_H_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_I_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_J_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_K_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_L_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_M_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_N_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_O_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_P_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_Q_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_R_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_S_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_T_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_U_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_V_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_W_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_X_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_Y_Fragment;
import fyp.umair.kidspreschoollearning.Fragments.Character_Z_Fragment;
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
            return;
        }
        if(view == findViewById(R.id.character_B_Id))
        {
            Fragment fragment = new Character_B_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
            return;
        }
        if(view == findViewById(R.id.character_C_Id))
        {
            Fragment fragment = new Character_C_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
            return;
        }
        else if(view == findViewById(R.id.character_D_Id))
        {
            Fragment fragment = new Character_D_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_E_Id))
        {
            Fragment fragment = new Character_E_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_F_Id))
        {
            Fragment fragment = new Character_F_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_G_Id))
        {
            Fragment fragment = new Character_G_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_H_Id))
        {
            Fragment fragment = new Character_H_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_I_Id))
        {
            Fragment fragment = new Character_I_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_J_Id))
        {
            Fragment fragment = new Character_J_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_K_Id))
        {
            Fragment fragment = new Character_K_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_L_Id))
        {
            Fragment fragment = new Character_L_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_M_Id))
        {
            Fragment fragment = new Character_M_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_N_Id))
        {
            Fragment fragment = new Character_N_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_O_Id))
        {
            Fragment fragment = new Character_O_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_P_Id))
        {
            Fragment fragment = new Character_P_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_Q_Id))
        {
            Fragment fragment = new Character_Q_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_R_Id))
        {
            Fragment fragment = new Character_R_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_S_Id))
        {
            Fragment fragment = new Character_S_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_T_Id))
        {
            Fragment fragment = new Character_T_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_U_Id))
        {
            Fragment fragment = new Character_U_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_V_Id))
        {
            Fragment fragment = new Character_V_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_W_Id))
        {
            Fragment fragment = new Character_W_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_X_Id))
        {
            Fragment fragment = new Character_X_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_Y_Id))
        {
            Fragment fragment = new Character_Y_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if(view == findViewById(R.id.character_Z_Id))
        {
            Fragment fragment = new Character_Z_Fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
    }
}
