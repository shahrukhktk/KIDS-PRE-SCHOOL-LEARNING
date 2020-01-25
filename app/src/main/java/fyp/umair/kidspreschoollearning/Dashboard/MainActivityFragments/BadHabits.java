package fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import fyp.umair.kidspreschoollearning.R;

public class BadHabits extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_badhabits, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.badHabits_toolbar_Id);
        toolbar.setTitle("Bad Habits");
        return view;
    }

}
