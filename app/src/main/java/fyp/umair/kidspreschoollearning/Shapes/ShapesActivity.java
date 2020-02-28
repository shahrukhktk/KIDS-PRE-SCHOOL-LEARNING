package fyp.umair.kidspreschoollearning.Shapes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

import fyp.umair.kidspreschoollearning.Animals.AnimalsActivity;
import fyp.umair.kidspreschoollearning.CalendarActivities.DaysNamesActivity;
import fyp.umair.kidspreschoollearning.CalendarActivities.IslamicMonths;
import fyp.umair.kidspreschoollearning.CalendarActivities.MonthsNamesActivity;
import fyp.umair.kidspreschoollearning.English_Category.EnglishActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.FruitsActivity;
import fyp.umair.kidspreschoollearning.FruitsandVegetables.VegetablesActivity;
import fyp.umair.kidspreschoollearning.HumanBodyParts.PartsOfBodyActivity;
import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
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

        textToSpeech = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    int langResult = textToSpeech.setLanguage(Locale.US);
                    if(langResult == TextToSpeech.LANG_NOT_SUPPORTED || langResult == TextToSpeech.LANG_MISSING_DATA)
                    {
                        Toast.makeText(getApplicationContext(), "Language Not Supported", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        square.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakSquare();
                                return;
                            }
                        });
                        rectangle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakRectangle();
                                return;
                            }
                        });
                        triangle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakTriangle();
                                return;
                            }
                        });
                        circle.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakCircle();
                                return;
                            }
                        });
                        oval.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakOval();
                                return;
                            }
                        });
                        heart.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakHeart();
                                return;
                            }
                        });
                        star.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakStar();
                                return;
                            }
                        });
                        crescent.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakCrescent();
                                return;
                            }
                        });
                        cross.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                speakCross();
                                return;
                            }
                        });


                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Initializatin Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void speakSquare()
    {
        textToSpeech.speak("Square", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakRectangle()
    {
        textToSpeech.speak("Rectangle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakTriangle()
    {
        textToSpeech.speak("Triangle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakCircle()
    {
        textToSpeech.speak("Circle", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakOval()
    {
        textToSpeech.speak("Oval", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakHeart()
    {
        textToSpeech.speak("Heart", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakStar()
    {
        textToSpeech.speak("Star", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakCrescent()
    {
        textToSpeech.speak("Crescent", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }
    public void speakCross()
    {
        textToSpeech.speak("Cross", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(0.5f);
    }

}
