package fyp.umair.kidspreschoollearning.Habits;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fyp.umair.kidspreschoollearning.R;

public class BadHabits extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_bad_habits, container, false);
    }
}
