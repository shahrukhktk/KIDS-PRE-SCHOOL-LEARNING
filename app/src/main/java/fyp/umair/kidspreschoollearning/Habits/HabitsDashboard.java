package fyp.umair.kidspreschoollearning.Habits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivity;
import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.BadHabits;
import fyp.umair.kidspreschoollearning.R;

public class HabitsDashboard extends AppCompatActivity {

    private ImageView goodHabits, badHabits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habits_dashboard);

        goodHabits = findViewById(R.id.goodHabits_image_ID);
        badHabits = findViewById(R.id.badHabits_image_ID);

        goodHabits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), GoodHabits.class));
            }
        });

        badHabits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), BadHabits.class));
            }
        });

    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
