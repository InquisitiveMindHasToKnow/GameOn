package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ohmstheresistance.gameonandroidchallenge.R;
import org.ohmstheresistance.gameonandroidchallenge.model.Games;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter<GamesViewHolder> {

    private List<Games> gamesList;

    public GamesAdapter(List<Games> gamesList) {

        this.gamesList = gamesList;
    }

    @NonNull
    @Override
    public GamesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.games_item_view, viewGroup, false);
        return new GamesViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull GamesViewHolder gamesViewHolder, int i) {

        Games games = gamesList.get(i);
        gamesViewHolder.onBind(games);
    }

    @Override
    public int getItemCount() {

        return gamesList.size();
    }
}
