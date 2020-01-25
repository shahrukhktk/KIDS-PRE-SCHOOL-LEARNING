package fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments;

import android.content.Intent;
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

import fyp.umair.kidspreschoollearning.CalendarActivities.DaysNamesActivity;
import fyp.umair.kidspreschoollearning.CalendarActivities.IslamicMonths;
import fyp.umair.kidspreschoollearning.CalendarActivities.MonthsNamesActivity;
import fyp.umair.kidspreschoollearning.English_Category.EnglishActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.FruitsActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.VegetablesActivity;
import fyp.umair.kidspreschoollearning.Habits.HabitsDashboard;
import fyp.umair.kidspreschoollearning.HumanBodyParts.PartsOfBodyActivity;
import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.R;
import fyp.umair.kidspreschoollearning.Shapes.ShapesActivity;

public class Dashboard extends Fragment
{
    View view;
    LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, habits, quiz;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        toolbar = (Toolbar) view.findViewById(R.id.dashboard_toolbar_Id);
        toolbar.setTitle("Dashboard");

        english = view.findViewById(R.id.englishActivityLayoutID);
        maths = view.findViewById(R.id.mathActivityLayoutID);
        fruits = view.findViewById(R.id.fruitsActivityLayoutID);
        vegetables = view.findViewById(R.id.vegetablesActivityLayoutID);
        shapes = view.findViewById(R.id.shapesActivityLayoutID);
        bodyparts = view.findViewById(R.id.partsOfBodyActivityLayoutID);
        days = view.findViewById(R.id.daysActivityLayoutID);
        months = view.findViewById(R.id.monthsActivityLayoutID);
        islamicMonths = view.findViewById(R.id.islamicMonthsActivityLayoutID);
        habits = view.findViewById(R.id.habitsActivityLayoutID);
        quiz = view.findViewById(R.id.quizDashboardLayoutID);

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
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FruitsActivity.class));
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), VegetablesActivity.class));
            }
        });
        bodyparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), PartsOfBodyActivity.class));
            }
        });
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ShapesActivity.class));
            }
        });
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), DaysNamesActivity.class));
            }
        });
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MonthsNamesActivity.class));
            }
        });
        islamicMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), IslamicMonths.class));
            }
        });
        habits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), HabitsDashboard.class));
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ShapesActivity.class));
            }
        });

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
