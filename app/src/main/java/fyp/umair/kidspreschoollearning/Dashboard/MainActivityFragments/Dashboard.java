package fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Locale;

import fyp.umair.kidspreschoollearning.Animals.AnimalsActivity;
import fyp.umair.kidspreschoollearning.CalendarActivities.DaysNamesActivity;
import fyp.umair.kidspreschoollearning.CalendarActivities.IslamicMonths;
import fyp.umair.kidspreschoollearning.CalendarActivities.MonthsNamesActivity;
import fyp.umair.kidspreschoollearning.English_Category.EnglishActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.FruitsActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.VegetablesActivity;
import fyp.umair.kidspreschoollearning.HumanBodyParts.PartsOfBodyActivity;
import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.QuizMarks.QuizResultDashboard;
import fyp.umair.kidspreschoollearning.R;
import fyp.umair.kidspreschoollearning.Shapes.ShapesActivity;

public class Dashboard extends Fragment
{
    private TextToSpeech mTTS;

    View view;
    LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, quiz;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        setHasOptionsMenu(true);
        toolbar = (Toolbar) view.findViewById(R.id.dashboard_toolbar_Id);
        toolbar.setTitle("Dashboard");

        english = view.findViewById(R.id.englishActivityLayoutID);
        maths = view.findViewById(R.id.mathActivityLayoutID);
        animals = view.findViewById(R.id.animalsActivityLayoutID);
        fruits = view.findViewById(R.id.fruitsActivityLayoutID);
        vegetables = view.findViewById(R.id.vegetablesActivityLayoutID);
        shapes = view.findViewById(R.id.shapesActivityLayoutID);
        bodyparts = view.findViewById(R.id.partsOfBodyActivityLayoutID);
        days = view.findViewById(R.id.daysActivityLayoutID);
        months = view.findViewById(R.id.monthsActivityLayoutID);
        islamicMonths = view.findViewById(R.id.islamicMonthsActivityLayoutID);
        quiz = view.findViewById(R.id.quizDashboardLayoutID);

        mTTS = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    int langResult = mTTS.setLanguage(Locale.US);
                    if(langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA)
                    {
                        Toast.makeText(getContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        english.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakEnglishAlphabets();
                                startActivity(new Intent(getContext(), EnglishActivity.class));
                                return;
                            }
                        });

                    }
                }
                else
                {
                    Toast.makeText(getContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MathsDashboard.class));
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), AnimalsActivity.class));
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
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), ShapesActivity.class));
            }
        });

        return view;
    }

    public void speakEnglishAlphabets()
    {
        mTTS.speak("English Alphabets", TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        inflater.inflate(R.menu.main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_quizResult:
                startActivity(new Intent(getActivity(), QuizResultDashboard.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
