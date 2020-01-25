package fyp.umair.kidspreschoollearning.QuizMarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import fyp.umair.kidspreschoollearning.R;

public class QuizResultDashboard extends AppCompatActivity {

    private LinearLayout english, maths, animals, bodyparts, fruits, vegetables, shapes, days, months, islamicMonths, habits;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result_dashboard);

        toolbar = (Toolbar) findViewById(R.id.quizlist_toolbar_Id);
        toolbar.setTitle("Quiz Result");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        english = findViewById(R.id.englishActivityLayoutID);
        maths = findViewById(R.id.mathActivityLayoutID);
        animals = findViewById(R.id.animalsActivityLayoutID);
        fruits = findViewById(R.id.fruitsActivityLayoutID);
        vegetables = findViewById(R.id.vegetablesActivityLayoutID);
        shapes = findViewById(R.id.shapesActivityLayoutID);
        bodyparts = findViewById(R.id.partsOfBodyActivityLayoutID);
        days = findViewById(R.id.daysActivityLayoutID);
        months = findViewById(R.id.monthsActivityLayoutID);
        islamicMonths = findViewById(R.id.islamicMonthsActivityLayoutID);
        habits = findViewById(R.id.habitsActivityLayoutID);

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
}
