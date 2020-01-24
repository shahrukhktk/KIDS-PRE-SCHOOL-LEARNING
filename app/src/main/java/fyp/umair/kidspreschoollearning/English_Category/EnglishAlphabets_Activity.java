package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_A_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_B_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_C_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_D_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_E_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_F_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_G_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_H_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_I_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_J_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_K_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_L_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_M_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_N_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_O_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_P_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_Q_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_R_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_S_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_T_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_U_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_V_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_W_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_X_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_Y_Fragment;
import fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments.Character_Z_Fragment;
import fyp.umair.kidspreschoollearning.R;

public class EnglishAlphabets_Activity extends AppCompatActivity
{
    private ImageView voiceBtn, AlphabetImage;
    private TextView alphabetLetter, alphabetName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets_);

        voiceBtn = (ImageView) findViewById(R.id.voicePlay_btnID);
        AlphabetImage = (ImageView) findViewById(R.id.alphabetImage_ID);
        alphabetLetter = (TextView) findViewById(R.id.alphabet_TxtId);
        alphabetName = (TextView) findViewById(R.id.alphabetName_TxtId);

    }

//    public void EnglishAlphabetsFragmentsCall(View view) {
//        if (view == findViewById(R.id.character_A_Id))
//        {
//            Fragment fragment = new Character_A_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_B_Id))
//        {
//            Fragment fragment = new Character_B_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_C_Id))
//        {
//            Fragment fragment = new Character_C_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_D_Id))
//        {
//            Fragment fragment = new Character_D_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_E_Id))
//        {
//            Fragment fragment = new Character_E_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_F_Id))
//        {
//            Fragment fragment = new Character_F_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_G_Id))
//        {
//            Fragment fragment = new Character_G_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_H_Id))
//        {
//            Fragment fragment = new Character_H_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_I_Id))
//        {
//            Fragment fragment = new Character_I_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_J_Id))
//        {
//            Fragment fragment = new Character_J_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_K_Id))
//        {
//            Fragment fragment = new Character_K_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_L_Id))
//        {
//            Fragment fragment = new Character_L_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_M_Id))
//        {
//            Fragment fragment = new Character_M_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_N_Id))
//        {
//            Fragment fragment = new Character_N_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_O_Id))
//        {
//            Fragment fragment = new Character_O_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_P_Id))
//        {
//            Fragment fragment = new Character_P_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_Q_Id))
//        {
//            Fragment fragment = new Character_Q_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_R_Id))
//        {
//            Fragment fragment = new Character_R_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_S_Id))
//        {
//            Fragment fragment = new Character_S_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_T_Id))
//        {
//            Fragment fragment = new Character_T_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_U_Id))
//        {
//            Fragment fragment = new Character_U_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_V_Id))
//        {
//            Fragment fragment = new Character_V_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_W_Id))
//        {
//            Fragment fragment = new Character_W_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_X_Id))
//        {
//            Fragment fragment = new Character_X_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_Y_Id))
//        {
//            Fragment fragment = new Character_Y_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//        else if(view == findViewById(R.id.character_Z_Id))
//        {
//            Fragment fragment = new Character_Z_Fragment();
//            FragmentManager fm = getSupportFragmentManager();
//            FragmentTransaction ft = fm.beginTransaction();
//            ft.replace(R.id.fragment_container_ID, fragment);
//            ft.commit();
//        }
//    }

    public void LaunchEnglishActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
    }

    public void EnglishAlphabetAct_A(View view) {
        AlphabetImage.setImageResource(R.drawable.apple);
        alphabetLetter.setText(R.string.aa);
        alphabetName.setText(R.string.apple);
    }

    public void EnglishAlphabetAct_B(View view) {
    }

    public void EnglishAlphabetAct_C(View view) {
    }

    public void EnglishAlphabetAct_D(View view) {
    }

    public void EnglishAlphabetAct_E(View view) {
    }

    public void EnglishAlphabetAct_F(View view) {
    }

    public void EnglishAlphabetAct_G(View view) {
    }

    public void EnglishAlphabetAct_H(View view) {
    }

    public void EnglishAlphabetAct_I(View view) {
    }

    public void EnglishAlphabetAct_J(View view) {
    }

    public void EnglishAlphabetAct_K(View view) {
    }

    public void EnglishAlphabetAct_L(View view) {
    }

    public void EnglishAlphabetAct_M(View view) {
    }

    public void EnglishAlphabetAct_N(View view) {
    }

    public void EnglishAlphabetAct_O(View view) {
    }

    public void EnglishAlphabetAct_P(View view) {
    }

    public void EnglishAlphabetAct_Q(View view) {
    }

    public void EnglishAlphabetAct_R(View view) {
    }

    public void EnglishAlphabetAct_S(View view) {
    }

    public void EnglishAlphabetAct_T(View view) {
    }

    public void EnglishAlphabetAct_U(View view) {
    }

    public void EnglishAlphabetAct_V(View view) {
    }

    public void EnglishAlphabetAct_W(View view) {
    }

    public void EnglishAlphabetAct_X(View view) {
    }

    public void EnglishAlphabetAct_Y(View view) {
    }

    public void EnglishAlphabetAct_Z(View view) {
    }
}
