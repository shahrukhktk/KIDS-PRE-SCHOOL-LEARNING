package fyp.umair.kidspreschoollearning.English_Category;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fyp.umair.kidspreschoollearning.R;

public class Alphabets_Fragment extends Fragment {

    public Alphabets_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_alphabets_, container, false);
        return view;
    }

}
