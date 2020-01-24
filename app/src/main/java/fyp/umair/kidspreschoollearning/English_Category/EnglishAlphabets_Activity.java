package fyp.umair.kidspreschoollearning.English_Category;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import fyp.umair.kidspreschoollearning.R;

public class EnglishAlphabets_Activity extends AppCompatActivity
{
    private ImageView voiceBtn, AlphabetImage;
    private TextView alphabetLetter, alphabetName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_alphabets_);

        voiceBtn = (ImageView) findViewById(R.id.voicePlay_btnID);
        AlphabetImage = (ImageView) findViewById(R.id.alphabetImage_ID);
        alphabetLetter = (TextView) findViewById(R.id.alphabet_TxtId);
        alphabetName = (TextView) findViewById(R.id.alphabetName_TxtId);

    }

    public void LaunchEnglishActivity(View view)
    {
        startActivity(new Intent(getApplicationContext(), EnglishActivity.class));
    }

    public void EnglishAlphabetAct_A(View view) {
        AlphabetImage.setImageResource(R.drawable.apple);
        alphabetLetter.setText(R.string.aa);
        alphabetName.setText(R.string.apple);
    }

    public void EnglishAlphabetAct_B(View view) {
        AlphabetImage.setImageResource(R.drawable.banana_fruit);
        alphabetLetter.setText(R.string.bb);
        alphabetName.setText(R.string.banana);
    }

    public void EnglishAlphabetAct_C(View view) {
    }

    public void EnglishAlphabetAct_D(View view) {
    }

    public void EnglishAlphabetAct_E(View view) {
    }

    public void EnglishAlphabetAct_F(View view) {
    }

    public void EnglishAlphabetAct_G(View view) {
    }

    public void EnglishAlphabetAct_H(View view) {
    }

    public void EnglishAlphabetAct_I(View view) {
    }

    public void EnglishAlphabetAct_J(View view) {
    }

    public void EnglishAlphabetAct_K(View view) {
    }

    public void EnglishAlphabetAct_L(View view) {
    }

    public void EnglishAlphabetAct_M(View view) {
    }

    public void EnglishAlphabetAct_N(View view) {
    }

    public void EnglishAlphabetAct_O(View view) {
    }

    public void EnglishAlphabetAct_P(View view) {
    }

    public void EnglishAlphabetAct_Q(View view) {
    }

    public void EnglishAlphabetAct_R(View view) {
    }

    public void EnglishAlphabetAct_S(View view) {
    }

    public void EnglishAlphabetAct_T(View view) {
    }

    public void EnglishAlphabetAct_U(View view) {
    }

    public void EnglishAlphabetAct_V(View view) {
    }

    public void EnglishAlphabetAct_W(View view) {
    }

    public void EnglishAlphabetAct_X(View view) {
    }

    public void EnglishAlphabetAct_Y(View view) {
    }

    public void EnglishAlphabetAct_Z(View view) {
    }
}
