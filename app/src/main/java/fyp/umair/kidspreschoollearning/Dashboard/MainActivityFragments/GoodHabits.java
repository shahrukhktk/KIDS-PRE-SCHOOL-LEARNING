package fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import fyp.umair.kidspreschoollearning.R;

public class GoodHabits extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.fragment_goodhabits, container, false);

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.goodHabits_toolbar_Id);
        toolbar.setTitle("Good Habits");
        return view;
    }

}
