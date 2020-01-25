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
        AlphabetImage.setImageResource(R.drawable.banana_img);
        alphabetLetter.setText(R.string.bb);
        alphabetName.setText(R.string.banana);
    }

    public void EnglishAlphabetAct_C(View view) {
        AlphabetImage.setImageResource(R.drawable.cat_img);
        alphabetLetter.setText(R.string.cc);
        alphabetName.setText(R.string.Cat);
    }

    public void EnglishAlphabetAct_D(View view) {
        AlphabetImage.setImageResource(R.drawable.doll_img);
        alphabetLetter.setText(R.string.dd);
        alphabetName.setText(R.string.doll);
    }

    public void EnglishAlphabetAct_E(View view) {
        AlphabetImage.setImageResource(R.drawable.elephant_image);
        alphabetLetter.setText(R.string.ee);
        alphabetName.setText(R.string.Elephant);
    }

    public void EnglishAlphabetAct_F(View view) {
        AlphabetImage.setImageResource(R.drawable.fish_img);
        alphabetLetter.setText(R.string.ff);
        alphabetName.setText(R.string.fish);
    }

    public void EnglishAlphabetAct_G(View view) {
        AlphabetImage.setImageResource(R.drawable.goat_img);
        alphabetLetter.setText(R.string.gg);
        alphabetName.setText(R.string.Goat);
    }

    public void EnglishAlphabetAct_H(View view) {
        AlphabetImage.setImageResource(R.drawable.horse_img);
        alphabetLetter.setText(R.string.hh);
        alphabetName.setText(R.string.Horse);
    }

    public void EnglishAlphabetAct_I(View view) {
        AlphabetImage.setImageResource(R.drawable.inkpot_img);
        alphabetLetter.setText(R.string.Ii);
        alphabetName.setText(R.string.Ink);
    }

    public void EnglishAlphabetAct_J(View view) {
        AlphabetImage.setImageResource(R.drawable.jug_img);
        alphabetLetter.setText(R.string.Jj);
        alphabetName.setText(R.string.Jug);
    }

    public void EnglishAlphabetAct_K(View view) {
        AlphabetImage.setImageResource(R.drawable.keys_img);
        alphabetLetter.setText(R.string.kk);
        alphabetName.setText(R.string.Keys);
    }

    public void EnglishAlphabetAct_L(View view) {
        AlphabetImage.setImageResource(R.drawable.lion_img);
        alphabetLetter.setText(R.string.ll);
        alphabetName.setText(R.string.Lion);
    }

    public void EnglishAlphabetAct_M(View view) {
        AlphabetImage.setImageResource(R.drawable.monkey_img);
        alphabetLetter.setText(R.string.mm);
        alphabetName.setText(R.string.Monkey);
    }

    public void EnglishAlphabetAct_N(View view) {
        AlphabetImage.setImageResource(R.drawable.nest_img);
        alphabetLetter.setText(R.string.nn);
        alphabetName.setText(R.string.nest);
    }

    public void EnglishAlphabetAct_O(View view) {
        AlphabetImage.setImageResource(R.drawable.orange_image);
        alphabetLetter.setText(R.string.oo);
        alphabetName.setText(R.string.orange);
    }

    public void EnglishAlphabetAct_P(View view) {
        AlphabetImage.setImageResource(R.drawable.parrot_img);
        alphabetLetter.setText(R.string.pp);
        alphabetName.setText(R.string.Parrot);
    }

    public void EnglishAlphabetAct_Q(View view) {
        AlphabetImage.setImageResource(R.drawable.queen_img);
        alphabetLetter.setText(R.string.qq);
        alphabetName.setText(R.string.Queen);
    }

    public void EnglishAlphabetAct_R(View view) {
        AlphabetImage.setImageResource(R.drawable.rabbit_img);
        alphabetLetter.setText(R.string.rr);
        alphabetName.setText(R.string.Rabbit);
    }

    public void EnglishAlphabetAct_S(View view) {
        AlphabetImage.setImageResource(R.drawable.sun_img);
        alphabetLetter.setText(R.string.ss);
        alphabetName.setText(R.string.Sun);
    }

    public void EnglishAlphabetAct_T(View view) {
        AlphabetImage.setImageResource(R.drawable.tortoise_img);
        alphabetLetter.setText(R.string.tt);
        alphabetName.setText(R.string.Tortoise);
    }

    public void EnglishAlphabetAct_U(View view) {
        AlphabetImage.setImageResource(R.drawable.umbrella_img);
        alphabetLetter.setText(R.string.uu);
        alphabetName.setText(R.string.Umbrella);
    }

    public void EnglishAlphabetAct_V(View view) {
        AlphabetImage.setImageResource(R.drawable.van_img);
        alphabetLetter.setText(R.string.vv);
        alphabetName.setText(R.string.Van);
    }

    public void EnglishAlphabetAct_W(View view) {
        AlphabetImage.setImageResource(R.drawable.watch_img);
        alphabetLetter.setText(R.string.ww);
        alphabetName.setText(R.string.Watch);
    }

    public void EnglishAlphabetAct_X(View view) {
        AlphabetImage.setImageResource(R.drawable.xray_img);
        alphabetLetter.setText(R.string.xx);
        alphabetName.setText(R.string.Xray);
    }

    public void EnglishAlphabetAct_Y(View view) {
        AlphabetImage.setImageResource(R.drawable.yoyo_img);
        alphabetLetter.setText(R.string.yy);
        alphabetName.setText(R.string.Yoyo);
    }

    public void EnglishAlphabetAct_Z(View view) {
        AlphabetImage.setImageResource(R.drawable.zebra_img);
        alphabetLetter.setText(R.string.zz);
        alphabetName.setText(R.string.Zebra);
    }
}
