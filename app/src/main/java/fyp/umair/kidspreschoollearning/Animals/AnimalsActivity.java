package fyp.umair.kidspreschoollearning.Animals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivity;
import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.Dashboard;
import fyp.umair.kidspreschoollearning.R;

public class AnimalsActivity extends AppCompatActivity {

    private ArrayList<Animals_Model> listOf_Animals;
    private RecyclerView recyclerView_animals;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        recyclerView_animals = findViewById(R.id.recyclerview_animalsID);
        recyclerView_animals.setLayoutManager(new LinearLayoutManager(this));
        listOf_Animals = new ArrayList<>();

        listOf_Animals.add(new Animals_Model("Lion", "This is all about lion. lion has yellow color.", R.drawable.lion_img, R.color.lion_color));
        listOf_Animals.add(new Animals_Model("Elephant", "This is all about elephant. Elephant is very friendly.", R.drawable.elephant_image, R.color.elephant_color));
        listOf_Animals.add(new Animals_Model("Cat", "This is all about cat. Cat looks pretty", R.drawable.cat_img, R.color.cat_color));
        listOf_Animals.add(new Animals_Model("Monkey", "This is all about lion. lion has yellow color.", R.drawable.monkey_img, R.color.monkey_color));
        listOf_Animals.add(new Animals_Model("Rabbit", "This is all about lion. lion has yellow color.", R.drawable.tortoise_img, R.color.tortoise_color));
        listOf_Animals.add(new Animals_Model("Zebra", "This is all about lion. lion has yellow color.", R.drawable.dolphin_img, R.color.dolphin_color));

        Animals_Adapter adapter = new Animals_Adapter(listOf_Animals, getApplicationContext());
        recyclerView_animals.setAdapter(adapter);

    }

    public void LaunchDashboard(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
