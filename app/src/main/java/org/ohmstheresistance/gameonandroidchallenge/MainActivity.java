package org.ohmstheresistance.gameonandroidchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import org.ohmstheresistance.gameonandroidchallenge.model.Games;
import org.ohmstheresistance.gameonandroidchallenge.model.GamesAPI;
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
    private RecyclerView gamesRecyclerView;

    private List<Games> gamesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                Log.d(TAG, "FINALLY " + response.body().get(2).getId());

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

}