package fyp.umair.kidspreschoollearning.Maths_Category.Tables;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import fyp.umair.kidspreschoollearning.Maths_Category.MathsDashboard;
import fyp.umair.kidspreschoollearning.R;

public class MathTables extends AppCompatActivity {

    private ImageView playbtn, tableId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_tables);

        playbtn = (ImageView) findViewById(R.id.playBtnID);
        tableId = (ImageView) findViewById(R.id.table_ID);

    }

    public void LaunchMathDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MathsDashboard.class));
    }

    public void TablesNumber2(View view) {
        tableId.setImageResource(R.drawable.table2_img);
    }

    public void TablesNumber3(View view) {
        tableId.setImageResource(R.drawable.table3_img);
    }

    public void TablesNumber4(View view) {
        tableId.setImageResource(R.drawable.table4_img);
    }

    public void TablesNumber5(View view) {
        tableId.setImageResource(R.drawable.table5_img);
    }

    public void TablesNumber6(View view) {
        tableId.setImageResource(R.drawable.table6_img);
    }

    public void TablesNumber7(View view) {
        tableId.setImageResource(R.drawable.table7_img);
    }

    public void TablesNumber8(View view) {
        tableId.setImageResource(R.drawable.table8_img);
    }

    public void TablesNumber9(View view) {
        tableId.setImageResource(R.drawable.table9_img);
    }

    public void TablesNumber10(View view) {
        tableId.setImageResource(R.drawable.table10_img);
    }
}
