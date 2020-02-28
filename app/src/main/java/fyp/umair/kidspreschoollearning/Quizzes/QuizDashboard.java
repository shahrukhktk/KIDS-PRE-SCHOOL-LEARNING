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

    private LinearLayout english_quiz, maths_quiz, animals_quiz, bodyparts_quiz, fruits_quiz, vegetables_quiz, shapes_quiz, days_quiz, months_quiz,
            islamicMonths_quiz, habits_quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_dashboard);

        english_quiz = findViewById(R.id.englishQuizActivityLayoutID);
        maths_quiz = findViewById(R.id.mathQuizActivityLayoutID);
        animals_quiz = findViewById(R.id.animalsQuizActivityLayoutID);
        fruits_quiz = findViewById(R.id.fruitsQuizActivityLayoutID);
        vegetables_quiz = findViewById(R.id.vegetablesQuizActivityLayoutID);
        shapes_quiz = findViewById(R.id.shapesQuizActivityLayoutID);
        bodyparts_quiz = findViewById(R.id.partsOfBodyQuizActivityLayoutID);
        days_quiz = findViewById(R.id.daysQuizActivityLayoutID);
        months_quiz = findViewById(R.id.monthsQuizActivityLayoutID);
        islamicMonths_quiz = findViewById(R.id.islamicMonthsQuizActivityLayoutID);
        habits_quiz = findViewById(R.id.habitsQuizActivityLayoutID);

        english_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        maths_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        animals_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        fruits_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        vegetables_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        shapes_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        bodyparts_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        days_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        months_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        islamicMonths_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MarksList.class));
            }
        });
        habits_quiz.setOnClickListener(new View.OnClickListener() {
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
