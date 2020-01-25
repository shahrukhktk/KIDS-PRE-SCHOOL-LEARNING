package fyp.umair.kidspreschoollearning.Quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.Dashboard;
import fyp.umair.kidspreschoollearning.R;

public class StartQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), Dashboard.class));
    }
}