package org.ohmstheresistance.gameonandroidchallenge.network;

import org.ohmstheresistance.gameonandroidchallenge.model.Games;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GameService {

@GET("InquisitiveMindHasToKnow/4fae2449d11bdb2fdc8d1b8da9c2bfc4/raw/3cf668bb5c5451de7567f6e1f0ad0a9be72c3b30/GameOnGames")
    Call<List<Games>> getGames();

}
