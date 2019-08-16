package org.ohmstheresistance.gameonandroidchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
    private RecyclerView gamesRecyclerView;
    private List<Games> gamesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gamesRecyclerView = findViewById(R.id.games_recycler_view);

        Retrofit gamesRetrofit = RetrofitSingleton.getRetrofitInstance();
        GameService gameService = gamesRetrofit.create(GameService.class);
        gameService.getId().enqueue(new Callback<List<Games>>() {
            @Override
            public void onResponse(Call<List<Games>> call, Response<List<Games>> response) {

                if (gamesList == null) {
                    Toast.makeText(getApplicationContext(), "Unable To Display Empty List", Toast.LENGTH_LONG).show();
                }

                Log.d(TAG, "Retrofit call works, Omar! " + response.body());
                GamesAdapter gamesAdapter = new GamesAdapter(gamesList);

                gamesList = response.body();
                gamesRecyclerView.setAdapter(gamesAdapter);
                gamesRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

            }

            @Override
            public void onFailure(Call<List<Games>> call, Throwable t) {
                Log.d(TAG, "Retrofit call failed, Omar" + t.getMessage());

            }
        });
    }

}