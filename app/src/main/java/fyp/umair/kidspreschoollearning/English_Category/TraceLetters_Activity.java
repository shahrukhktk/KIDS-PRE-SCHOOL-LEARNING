package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import fyp.umair.kidspreschoollearning.R;
import fyp.umair.kidspreschoollearning.TraceLetters.Trace_A_fragment;

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

    }
}
