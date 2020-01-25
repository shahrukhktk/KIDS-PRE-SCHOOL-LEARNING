package fyp.umair.kidspreschoollearning.Quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.Dashboard;
import fyp.umair.kidspreschoollearning.QuizMarks.MarksList;
import fyp.umair.kidspreschoollearning.R;

public class QuizDashboard extends AppCompatActivity {

    private LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, habits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_dashboard);
        english = findViewById(R.id.englishQuizActivityLayoutID);
        maths = findViewById(R.id.mathQuizActivityLayoutID);
        animals = findViewById(R.id.animalsQuizActivityLayoutID);
        fruits = findViewById(R.id.fruitsQuizActivityLayoutID);
        vegetables = findViewById(R.id.vegetablesQuizActivityLayoutID);
        shapes = findViewById(R.id.shapesQuizActivityLayoutID);
        bodyparts = findViewById(R.id.partsOfBodyQuizActivityLayoutID);
        days = findViewById(R.id.daysQuizActivityLayoutID);
        months = findViewById(R.id.monthsQuizActivityLayoutID);
        islamicMonths = findViewById(R.id.islamicMonthsQuizActivityLayoutID);
        habits = findViewById(R.id.habitsQuizActivityLayoutID);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        shapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        bodyparts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        islamicMonths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        habits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), Dashboard.class));
    }
}
