package fyp.umair.kidspreschoollearning.Shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.LinearLayout;

import fyp.umair.kidspreschoollearning.R;

public class ShapesActivity extends AppCompatActivity
{
    private LinearLayout square, rectangle, triangle, circle, oval, heart, star, crescent, cross;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        Toolbar toolbar = findViewById(R.id.shapesToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
