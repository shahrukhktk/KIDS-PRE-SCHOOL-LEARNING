package fyp.umair.kidspreschoollearning.Dashboard;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.widget.TextView;

import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.Dashboard;
import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.GoodHabits;
import fyp.umair.kidspreschoollearning.Dashboard.MainActivityFragments.BadHabits;
import fyp.umair.kidspreschoollearning.R;

public class MainActivity extends AppCompatActivity
{
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_goodHabits:
                {
                    Fragment fragmentHabits = new GoodHabits();
                    FragmentManager fragmentManagerHabits = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionHabits = fragmentManagerHabits.beginTransaction();
                    fragmentTransactionHabits.replace(R.id.fragment_container_ID, fragmentHabits);
                    fragmentTransactionHabits.commit();
                    return true;
                }
                case R.id.navigation_dashboard:
                {
                    Fragment fragmentDashboard = new Dashboard();
                    FragmentManager fragmentManagerDashboard = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionDashbaord = fragmentManagerDashboard.beginTransaction();
                    fragmentTransactionDashbaord.replace(R.id.fragment_container_ID, fragmentDashboard);
                    fragmentTransactionDashbaord.commit();
                    return true;
                }
                case R.id.navigation_badhabits:
                {
                    Fragment fragmentPrayers = new BadHabits();
                    FragmentManager fragmentManagerPrayers = getSupportFragmentManager();
                    FragmentTransaction fragmentTransactionPrayers = fragmentManagerPrayers.beginTransaction();
                    fragmentTransactionPrayers.replace(R.id.fragment_container_ID, fragmentPrayers);
                    fragmentTransactionPrayers.commit();
                    return true;
                }
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.fragment_container_ID, new Dashboard());
        tx.commit();
    }

}
