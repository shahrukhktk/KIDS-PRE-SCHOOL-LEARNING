package fyp.umair.kidspreschoollearning.EnglishAlphabetsFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fyp.umair.kidspreschoollearning.R;

public class Character_A_Fragment extends Fragment {

    public Character_A_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a_activity_, container, false);
        return view;
    }

}
