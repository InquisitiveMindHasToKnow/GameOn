package org.ohmstheresistance.gameonandroidchallenge;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import org.ohmstheresistance.gameonandroidchallenge.model.Games;
import org.ohmstheresistance.gameonandroidchallenge.network.GameService;
import org.ohmstheresistance.gameonandroidchallenge.network.RetrofitSingleton;
import org.ohmstheresistance.gameonandroidchallenge.recyclerview.GamesAdapter;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "GameJSON.TAG";
    private BottomNavigationView sports_navView;
    private RecyclerView gamesRecyclerView;
    private DrawerLayout drawerLayout;
    private NavigationView navView;
    private ScrollView scrollView;

    private List<Games> gamesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        navView = findViewById(R.id.nav_view);
        scrollView = findViewById(R.id.scrollView);
        

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_nav_menu);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);

            Drawable toolbarBackground = getResources().getDrawable(R.drawable.gameonrankandlogo);
            getSupportActionBar().setBackgroundDrawable(toolbarBackground);
        }

        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                menuItem.setChecked(true);
                drawerLayout.closeDrawers();

                switch (menuItem.getItemId()) {
                    case R.id.gameon_balance_item:
                        break;
                    case R.id.gameon_mypicks_item:
                        break;
                    case R.id.gameon_lifetime_points_item:
                        break;
                    case R.id.gameon_refer_friends_item:
                        break;
                    case R.id.gameon_how_to_play_item:
                        break;
                }
                return true;
            }
        });

        gamesRecyclerView = findViewById(R.id.games_recycler_view);
        gamesList = new ArrayList<>();


        Retrofit gamesRetrofit = RetrofitSingleton.getRetrofitInstance();
        GameService gameService = gamesRetrofit.create(GameService.class);
        gameService.getGames().enqueue(new Callback<List<Games>>() {
            @Override
            public void onResponse(Call<List<Games>> call, Response<List<Games>> response) {


                if (!response.isSuccessful()) {
                    Log.d(TAG, "Unable To Display Empty List " + response.body());
                    return;
                }


                gamesList = response.body();

                if (gamesList == null) {
                    Toast.makeText(getApplicationContext(), "Unable To Display Empty List", Toast.LENGTH_LONG).show();
                }

                Log.d(TAG, "Retrofit call works " + response.body().get(6).getBroadcast_info());

                GamesAdapter gamesAdapter = new GamesAdapter(gamesList);
                gamesRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                gamesRecyclerView.setAdapter(gamesAdapter);


            }

            @Override
            public void onFailure(Call<List<Games>> call, Throwable t) {

                Log.d(TAG, "Retrofit call failed, Omar" + t.getMessage());


            }

        });

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            int mMenuId = item.getItemId();


            switch (mMenuId) {
                case R.id.sports_navigation_all:
                    break;

                case R.id.sports_navigation_mlb:
                    break;

                case R.id.sports_navigation_nfl:
                    break;

                case R.id.sports_navigation_nba:
                    break;

                case R.id.sports_navigation_epl:

                    break;
            }

            return true;
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }




}