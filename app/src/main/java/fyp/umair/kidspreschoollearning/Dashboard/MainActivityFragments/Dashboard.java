package fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import fyp.umair.kidspreschoollearning.English_Category.EnglishActivity;
import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.R;

public class Dashboard extends Fragment
{
    View view;
    LinearLayout english, maths;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        toolbar = (Toolbar) view.findViewById(R.id.dashboard_toolbar_Id);
        toolbar.setTitle("Dashboard");

        english = view.findViewById(R.id.englishActivityLayoutID);
        maths = view.findViewById(R.id.mathActivityLayoutID);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), EnglishActivity.class));
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MathsDashboard.class));
            }
        });

        return view;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        getActivity().getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_feedback) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

}
