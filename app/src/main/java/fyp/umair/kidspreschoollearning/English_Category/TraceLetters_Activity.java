package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import fyp.umair.kidspreschoollearning.R;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_A_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_B_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_C_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_D_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_E_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_F_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_G_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_H_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_I_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_J_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_K_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_L_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_M_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_N_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_O_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_P_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_Q_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_R_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_S_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_T_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_U_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_V_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_W_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_X_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_Y_fragment;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_Z_fragment;

public class TraceLetters_Activity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trace_letters_);
    }

    public void TraceAlphabetsFragmentsCall(View view)
    {
        if (view == findViewById(R.id.trace_A_Id))
        {
            Fragment fragment = new Trace_A_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_B_Id))
        {
            Fragment fragment = new Trace_B_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_C_Id))
        {
            Fragment fragment = new Trace_C_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_D_Id))
        {
            Fragment fragment = new Trace_D_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_E_Id))
        {
            Fragment fragment = new Trace_E_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_F_Id))
        {
            Fragment fragment = new Trace_F_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_G_Id))
        {
            Fragment fragment = new Trace_G_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_H_Id))
        {
            Fragment fragment = new Trace_H_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_I_Id))
        {
            Fragment fragment = new Trace_I_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_J_Id))
        {
            Fragment fragment = new Trace_J_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_K_Id))
        {
            Fragment fragment = new Trace_K_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_L_Id))
        {
            Fragment fragment = new Trace_L_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_M_Id))
        {
            Fragment fragment = new Trace_M_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_N_Id))
        {
            Fragment fragment = new Trace_N_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_O_Id))
        {
            Fragment fragment = new Trace_O_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_P_Id))
        {
            Fragment fragment = new Trace_P_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_Q_Id))
        {
            Fragment fragment = new Trace_Q_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_R_Id))
        {
            Fragment fragment = new Trace_R_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_S_Id))
        {
            Fragment fragment = new Trace_S_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_T_Id))
        {
            Fragment fragment = new Trace_T_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_U_Id))
        {
            Fragment fragment = new Trace_U_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_V_Id))
        {
            Fragment fragment = new Trace_V_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_W_Id))
        {
            Fragment fragment = new Trace_W_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_X_Id))
        {
            Fragment fragment = new Trace_X_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_Y_Id))
        {
            Fragment fragment = new Trace_Y_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }
        else if (view == findViewById(R.id.trace_Z_Id))
        {
            Fragment fragment = new Trace_Z_fragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_container_ID, fragment);
            ft.commit();
        }

    }

    public void LaunchEnglishActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
    }
}
