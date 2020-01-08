package fyp.umair.kidspreschoollearning.FruitsandVegetables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.umair.kidspreschoollearning.R;

public class FruitsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        Toolbar toolbar = findViewById(R.id.fruitsToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Fruits");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
