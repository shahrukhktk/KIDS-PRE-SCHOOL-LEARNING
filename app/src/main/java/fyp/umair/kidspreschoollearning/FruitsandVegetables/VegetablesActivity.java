package fyp.umair.kidspreschoollearning.FruitsandVegetables;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import fyp.umair.kidspreschoollearning.R;

public class VegetablesActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        Toolbar toolbar = findViewById(R.id.vegetablesToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
