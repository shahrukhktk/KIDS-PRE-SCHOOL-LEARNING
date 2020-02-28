package fyp.umair.kidspreschoollearning.Shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.LinearLayout;

import fyp.umair.kidspreschoollearning.R;

public class ShapesActivity extends AppCompatActivity
{
    private TextToSpeech textToSpeech;
    private LinearLayout square, rectangle, triangle, circle, oval, heart, star, crescent, cross;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        Toolbar toolbar = findViewById(R.id.shapesToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        square = findViewById(R.id.squareshape_id);
        rectangle = findViewById(R.id.rectangleshape_id);
        triangle = findViewById(R.id.trianlgeshape_id);
        circle = findViewById(R.id.circleshape_id);
        oval = findViewById(R.id.ovalshape_id);
        heart = findViewById(R.id.heartshape_id);
        star = findViewById(R.id.starshape_id);
        crescent = findViewById(R.id.cresentshape_id);
        cross = findViewById(R.id.crossshape_id);

    }

    public void speakSquare()
    {
        textToSpeech.speak("Square", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakRectangle()
    {
        textToSpeech.speak("Rectangle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakTriangle()
    {
        textToSpeech.speak("Triangle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakCircle()
    {
        textToSpeech.speak("Circle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakOval()
    {
        textToSpeech.speak("Oval", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakHeart()
    {
        textToSpeech.speak("Heart", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakStar()
    {
        textToSpeech.speak("Star", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakCrescent()
    {
        textToSpeech.speak("Crescent", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }
    public void speakCross()
    {
        textToSpeech.speak("Cross", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(1.5f);
    }

}
