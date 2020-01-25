package fyp.umair.kidspreschoollearning.QuizMarks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.umair.kidspreschoollearning.R;

public class MarksList extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_list);

        toolbar = (Toolbar) findViewById(R.id.dashboard_toolbar_Id);
        toolbar.setTitle("Quiz Result");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
