package org.ohmstheresistance.gameonandroidchallenge.recyclerview;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.squareup.picasso.Picasso;

import org.ohmstheresistance.gameonandroidchallenge.R;
import org.ohmstheresistance.gameonandroidchallenge.model.Games;


public class GamesViewHolder extends RecyclerView.ViewHolder {

    private CircularImageView homeTeamCircularImageView;
    private CircularImageView visitorTeamCircularImageView;
    private TextView homeTeamName;
    private TextView visitorTeamName;
    private TextView homeTeamScore;
    private TextView visitorTeamScore;
    private Button playNowButton;
    private Button pickTimeButton;


    private String homeTeamLogo;
    private String visitorTeamLogo;

    private static final String TAG = "GameJSON.TAG";


    public GamesViewHolder(@NonNull View itemView) {

        super(itemView);

        homeTeamCircularImageView = itemView.findViewById(R.id.home_team_circularimageview);
        visitorTeamCircularImageView = itemView.findViewById(R.id.visitor_team_circularimageview);
        homeTeamName = itemView.findViewById(R.id.home_team_name_textview);
        visitorTeamName = itemView.findViewById(R.id.visitor_team_name_textview);
        homeTeamScore = itemView.findViewById(R.id.home_team_score_textview);
        visitorTeamScore = itemView.findViewById(R.id.visitor_team_score_textview);
        playNowButton = itemView.findViewById(R.id.play_now_button);
        pickTimeButton = itemView.findViewById(R.id.gameon_date_and_time_button);


    }


    @SuppressLint({"SetTextI18n", "SimpleDateFormat"})
    public void onBind(final Games games) {

        String homeTeam = games.getHome_team().getName();
        String[] splitHomeTeamName = homeTeam.split(" ");

        if (splitHomeTeamName.length <= 2) {
            homeTeamName.setText(splitHomeTeamName[0] + "\n" + splitHomeTeamName[1]);

        } else {

            homeTeamName.setText(splitHomeTeamName[0] + " " + splitHomeTeamName[1] + "\n" + splitHomeTeamName[2]);

            //homeTeamName.setTextColor(Color.parseColor("#B3B3B3"));
            homeTeamName.setTextColor(Color.parseColor("#141414"));

        }


        String visitorTeam = games.getVisitor_team().getName();
        String[] splitVisitorTeamName = visitorTeam.split(" ");

        if (splitVisitorTeamName.length <= 2) {
            visitorTeamName.setText(splitVisitorTeamName[0] + "\n" + splitVisitorTeamName[1]);


        } else {

            visitorTeamName.setText(splitVisitorTeamName[0] + " " + splitVisitorTeamName[1] + "\n" + splitVisitorTeamName[2]);

        }

        visitorTeamLogo = games.getVisitor_team().getLogo();
        homeTeamLogo = games.getHome_team().getLogo();


        //homeTeamScore.setText(games.getHome_team_points());
        //visitorTeamScore.setText(games.getVisitor_team_points());

        Picasso.get()
                .load(homeTeamLogo)
                .into(homeTeamCircularImageView);


        Picasso.get()
                .load(visitorTeamLogo)
                .into(visitorTeamCircularImageView);


        String dateAndTime = games.getDate();
        String[] splitDateAndTime = dateAndTime.split("T");

        if (splitDateAndTime[0].equals("2019-03-14")) {

            pickTimeButton.setText("GameOn in \n 2hr:35m:48s\n");
            playNowButton.setText("Picks Completed");
            playNowButton.setEnabled(false);
            playNowButton.setBackgroundResource(R.drawable.curved_pickscomplete_button);

        } else {

            String[] splitDateAndTime1 = dateAndTime.split("T|.\\.");

            pickTimeButton.setText("GameOn @ \n" + splitDateAndTime1[0] + ", " + splitDateAndTime1[1].substring(1, 5) + " PM");
            playNowButton.setText("Play Now");


        }

    }

}