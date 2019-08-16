package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

import org.ohmstheresistance.gameonandroidchallenge.R;
import org.ohmstheresistance.gameonandroidchallenge.model.Games;

public class GamesViewHolder extends RecyclerView.ViewHolder {

    private CircularImageView homeTeamCircularImageView;
    private CircularImageView awayTeamCircularImageView;
    private TextView homeTeamName;
    private TextView awayTeamName;
    private TextView homeTeamScore;
    private TextView awayTeamScore;


    public GamesViewHolder(@NonNull View itemView) {

        super(itemView);

        homeTeamCircularImageView = itemView.findViewById(R.id.home_team_circularimageview);
        awayTeamCircularImageView = itemView.findViewById(R.id.away_team_circularimageview);
        homeTeamName = itemView.findViewById(R.id.home_team_name_textview);
        awayTeamName = itemView.findViewById(R.id.away_team_name_textview);
        homeTeamScore = itemView.findViewById(R.id.home_team_score_textview);
        awayTeamScore = itemView.findViewById(R.id.away_team_score_textview);

    }

    public void onBind(final Games games) {

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                homeTeamName.setText(games.getHome_team().getName());
                awayTeamName.setText(games.getVisitor_team().getName());

            }

        });

    }
}