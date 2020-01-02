package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fyp.umair.kidspreschoollearning.R;

public class EnglishActivity extends AppCompatActivity
{
    private ImageView alphbatesBtn, traceLettersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        alphbatesBtn = (ImageView) findViewById(R.id.alphabets_image_ID);
        traceLettersBtn = (ImageView) findViewById(R.id.traceletters_image_ID);

        alphbatesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), EnglishAlphabets_Activity.class));
            }
        });

        traceLettersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(getApplicationContext(), TraceLetters_Activity.class));
            }
        });

    }
}
